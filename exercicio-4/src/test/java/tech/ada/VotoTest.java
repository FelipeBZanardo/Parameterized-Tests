package tech.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VotoTest {

    @ParameterizedTest
    @MethodSource(value = "obterDadosVotoObrigatorio")
    void deveVerificarSeVotoEhObrigatorio(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @MethodSource(value = "obterDadosVotoFacultativo")
    void deveVerificarSeVotoEhFacultativo(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }
    @ParameterizedTest
    @MethodSource(value = "obterDadosVotoSemDireito")
    void deveVerificarSeNaoTemDireitoAVotar(int idade, String resultadoEsperado){
        assertEquals(resultadoEsperado, Voto.verificarVoto(idade));
    }

    private static Stream<Arguments> obterDadosVotoObrigatorio(){
        String resultadoEsperado = "Voto obrigatório";
        return Stream.of(Arguments.of("18", resultadoEsperado),
                Arguments.of("35", resultadoEsperado),
                Arguments.of("70", resultadoEsperado));
    }

    private static Stream<Arguments> obterDadosVotoFacultativo(){
        String resultadoEsperado = "Voto facultativo";
        return Stream.of(Arguments.of("16", resultadoEsperado),
                Arguments.of("17", resultadoEsperado),
                Arguments.of("71", resultadoEsperado),
                Arguments.of("80", resultadoEsperado));
    }

    private static Stream<Arguments> obterDadosVotoSemDireito(){
        String resultadoEsperado = "Sem direito a votar";
        return Stream.of(Arguments.of("10", resultadoEsperado),
                Arguments.of("12", resultadoEsperado),
                Arguments.of("15", resultadoEsperado));
    }
}