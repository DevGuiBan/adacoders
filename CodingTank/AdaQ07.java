package CodingTank;

public class AdaQ07 {
    /*
    * for, array e métodos - Inversão de Array
    *
    * Escreva um programa que inverta a ordem dos elementos em um array de caracteres.
    * Exemplo:
    *
    * Entrada: ['a', 'b', 'c', 'd', 'e'];
    * Saída: ['e', 'd', 'c', 'b', 'a'];
    *
    */

    public static void main(String[] args){
        char[] array = {'a','b','c','d','e'};

        char[] invertedAr = inverter(array);

        for(char i : invertedAr){
            System.out.println(i);
        }
    }

    public static char[] inverter(char[] a) {
        char n = (char) a.length;
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            result[i] = a[n - i - 1];
        }

        return result;
    }
}
