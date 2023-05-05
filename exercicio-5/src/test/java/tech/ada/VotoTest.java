package tech.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tech.ada.exception.IdadeExageradaException;
import tech.ada.exception.IdadeNegativaException;

import static org.junit.jupiter.api.Assertions.*;

class VotoTest {
    @ParameterizedTest
    @ValueSource(ints = {-1, -5})
    void idadeNegativaDeveGerarException(int idade){
        IdadeNegativaException idadeNegativaException = assertThrows(IdadeNegativaException.class,
                () -> Voto.verificarVoto(idade));
        assertEquals("Idade não pode ser negativa", idadeNegativaException.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {123, 1000})
    void idadeExageradaDeveGerarException(int idade){
        IdadeExageradaException idadeExageradaException = assertThrows(IdadeExageradaException.class,
                () -> Voto.verificarVoto(idade));
        assertEquals("Idade exagerada. Maior idade de um humano registrada é de 122 anos",
                idadeExageradaException.getMessage());
    }

}