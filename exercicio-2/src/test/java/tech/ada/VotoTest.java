package tech.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VotoTest {

    @ParameterizedTest
    @CsvSource(value = {"18, Voto obrigatório", "35, Voto obrigatório", "70, Voto obrigatório"})
    void deveVerificarSeVotoEhObrigatorio(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @CsvSource(value = {"16, Voto facultativo", "17, Voto facultativo",
            "71, Voto facultativo", "80, Voto facultativo"})
    void deveVerificarSeVotoEhFacultativo(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @CsvSource(value = {"10, Sem direito a votar", "12, Sem direito a votar", "15, Sem direito a votar"})
    void deveVerificarSeNaoTemDireitoAVotar(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }

}