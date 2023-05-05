package tech.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class VotoTest {
    @ParameterizedTest
    @CsvFileSource(files = {"voto-obrigatorio.csv"})
    void deveVerificarSeVotoEhObrigatorio(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @CsvFileSource(files = {"voto-facultativo.csv"})
    void deveVerificarSeVotoEhFacultativo(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @CsvFileSource(files = {"voto-sem-direito.csv"})
    void deveVerificarSeNaoTemDireitoAVotar(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
}