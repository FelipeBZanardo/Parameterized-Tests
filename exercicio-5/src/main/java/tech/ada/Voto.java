package tech.ada;

import tech.ada.exception.IdadeExageradaException;
import tech.ada.exception.IdadeNegativaException;

public class Voto {
    public static String verificarVoto(int idade){
        verificarIdade(idade);
        if ((idade >= 16 && idade < 18) || idade > 70)
            return "Voto facultativo";
        else if(idade >= 18)
            return "Voto obrigatório";
        return "Sem direito a votar";
    }

    private static void verificarIdade(int idade) throws IdadeNegativaException, IdadeExageradaException{
        if(idade < 0)
            throw new IdadeNegativaException();
        if(idade > 122)
            throw new IdadeExageradaException();
    }

}
