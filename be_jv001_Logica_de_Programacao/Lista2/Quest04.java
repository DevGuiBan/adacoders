package be_jv001_Logica_de_Programacao.Lista2;

//Dado um inteiro, X, imprima seus primeiros 10 múltiplos.
//Cada múltiplo X * i (onde 1 <= i <= 10) deve ser impresso em uma nova linha na forma: X x i = resultado.
//Exemplo de input - > 2
//Exemplo de output ->
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X;

        System.out.print("Digite o número da tabuada que deseja ver: ");
        X = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", X, i, X*i);
        }
    }
}
