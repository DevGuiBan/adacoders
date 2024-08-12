package be_jv001_Logica_de_Programacao.Aulas;

//// Exercicio 2 (Facil) ->  ReverseArray
//NIvel 2 - InPlace - Não pode criar uma nova array, deve realizar as operações na mesma array

public class Friends3 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};

        int auxiliar;

        for (int aux : array1){
            System.out.println(aux);
        }

        for(int i = 0; i < array1.length/2; i++){
            auxiliar = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = auxiliar;
        }

        System.out.println("________________");

        for (int aux : array1){
            System.out.println(aux);
        }
    }
}
