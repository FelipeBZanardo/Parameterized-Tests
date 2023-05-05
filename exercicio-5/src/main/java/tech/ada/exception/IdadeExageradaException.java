package tech.ada.exception;

public class IdadeExageradaException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Idade exagerada. Maior idade de um humano registrada é de 122 anos";
    }
}
