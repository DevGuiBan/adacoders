package be_jv001_Logica_de_Programacao.Aulas;

//// Exercicio 1 (Facil) -> Escreva um metodo que diz se 2 arrays são iguais

public class Friends {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4};

        boolean testandoArrays = true;

        if (array1.length != array2.length) {
            System.out.println("Arrays de tamanhos diferentes");

        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    testandoArrays = false;
                    break;
                }
            }
            if (testandoArrays) {
                System.out.println("Arrays iguais");
            } else {
                System.out.println("Arrays diferentes");
            }
        }
    }

}
