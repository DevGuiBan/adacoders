package CodingTank;

import java.util.Scanner;

public class AdaQ03 {
    public static void main(String[] args){

        //Escreva um programa que aceite três números inteiros e determine o maior entre eles.

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        int maior = 0;

        System.out.print("numero1: ");
        num1 = scanner.nextInt();
        System.out.print("numero2: ");
        num2 = scanner.nextInt();
        System.out.print("numero3: ");
        num3 = scanner.nextInt();

        if(num1 >= num2 && num1 >= num3){
            maior = num1;
        }else if(num2 >= num1 && num2 >= num3){
            maior = num2;
        }else {
            maior = num3;
        }

        System.out.println("Maior número é: " + maior);
    }
}
