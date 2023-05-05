package tech.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoTest {
    @ParameterizedTest
    @ValueSource(ints = {18, 35, 70})
    void deveVerificarSeVotoEhObrigatorio(int idade){
        assertEquals("Voto obrigatório", Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @ValueSource(ints = {16, 17, 71, 80})
    void deveVerificarSeVotoEhFacultativo(int idade){
        assertEquals("Voto facultativo", Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @ValueSource(ints = {10, 12, 15})
    void deveVerificarSeNaoTemDireitoAVotar(int idade){
        assertEquals("Sem direito a votar", Voto.verificarVoto(idade));
    }

}