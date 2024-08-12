package be_jv001_Logica_de_Programacao.Aulas;

// 2 - Dado um array de nomes e um nome alvo, printar na tela se o nome alvo existe ou não na array

public class AtvA4 {

    public static void main(String[] args) {
        String[] nomes = {"Alice", "Bob", "Charlie", "Diana"};

        String nomeParaVerificar = "Charlie";
        boolean estaPresente = verificarNomeNoArray(nomes, nomeParaVerificar);

        if (estaPresente) {
            System.out.println("O nome " + nomeParaVerificar + " está presente no array.");
        } else {
            System.out.println("O nome " + nomeParaVerificar + " não está presente no array.");
        }
    }

    public static boolean verificarNomeNoArray(String[] array, String nome) {
        for (String elemento : array) {
            if (elemento.equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
