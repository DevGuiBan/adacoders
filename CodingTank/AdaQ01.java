package CodingTank;

import java.util.Scanner;

public class AdaQ01 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.print("Número 1: ");
        num1 = scanner.nextInt();
        System.out.print("Número 2: ");
        num2 = scanner.nextInt();

        result = num1 + num2;
        System.out.println("Resultado soma: " + result);

        result = num1 - num2;
        System.out.println("Resultado subtração: " + result);

        result = num1 * num2;
        System.out.println("Resultado multiplicação: " + result);

        if(num2 != 0){
            result = num1 / num2;
            System.out.println("Resultado divisão: " + result);

            float floatResult = (float) num1 / num2;
            System.out.println("Resultado divisão - ponto flutuante: " + floatResult);
        }else {
            System.out.println("Divisão por zero não permitida");
        }

        scanner.close();
    }
}
