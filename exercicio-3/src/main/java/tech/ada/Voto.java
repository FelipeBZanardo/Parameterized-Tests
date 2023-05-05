package tech.ada;

public class Voto {
    public static String verificarVoto(int idade){
        if ((idade >= 16 && idade < 18) || idade > 70)
            return "Voto facultativo";
        else if(idade >= 18)
            return "Voto obrigatório";
        return "Sem direito a votar";
    }

}
