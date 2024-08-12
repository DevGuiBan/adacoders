package be_jv001_Logica_de_Programacao.Lista2;

import java.util.Scanner;

//Dado um número encontre o seu fatorial.

public class Quest05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
