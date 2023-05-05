package tech.ada.exception;

public class IdadeNegativaException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Idade não pode ser negativa";
    }
}
