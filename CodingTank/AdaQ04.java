package CodingTank;

import java.util.Scanner;

public class AdaQ04 {

    public static void main(String[] args){

        /*
        * Crie um enum chamado 'OperacaoMatematica' representando operações matemáticas básicas:
        *
        * (+, -, *, /)
        *
        * Utilize um Scanner para obter a operação do usuário e realizar o cálculo com dois números.
        */

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.print("Número 1: ");
        num1 = scanner.nextInt();
        System.out.print("Número 2: ");
        num2 = scanner.nextInt();

        int operacoeMatematica;

        System.out.println("1 -> +");
        System.out.println("2 -> -");
        System.out.println("3 -> *");
        System.out.println("4 -> /");

        System.out.println("Digite a operação desejada: ");
        operacoeMatematica = scanner.nextInt();

        String operacaoDesejada = switch (operacoeMatematica){
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> "invalid";
        };

        if(operacaoDesejada.equals("+")){
            result = num1 + num2;
            System.out.println("Resultado soma: " + result);
        }else if(operacaoDesejada.equals("-")){
            result = num1 - num2;
            System.out.println("Resultado subtração: " + result);
        }else if(operacaoDesejada.equals("*")){
            result = num1 * num2;
            System.out.println("Resultado multiplicação: " + result);
        }else if(operacaoDesejada.equals("/")){
            if(num2 != 0){
                result = num1 / num2;
                System.out.println("Resultado divisão: " + result);

                float floatResult = (float) num1 / num2;
                System.out.println("Resultado divisão - ponto flutuante: " + floatResult);
            }else {
                System.out.println("Divisão por zero não permitida");
            }
        }

        scanner.close();
    }
}
