package be_jv001_Logica_de_Programacao.Aulas;

//Exercicio 2 (Facil) ->  ReverseArray
////Nivel 1 - Utilizar uma nova array

public class Friends2 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};

        int[] arrayReverse = new int[array1.length];

        for(int i = 0; i < array1.length; i++){
            arrayReverse[i] = array1[array1.length - 1 - i];
        }

        for(int print : arrayReverse){
            System.out.println(print);
        }

        for(int print : array1){
            System.out.println(print);
        }
    }
}
