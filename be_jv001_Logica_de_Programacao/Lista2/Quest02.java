package be_jv001_Logica_de_Programacao.Lista2;

import java.util.Scanner;

//Desenvolver uma calculadora que o usuário será capaz de escolher uma das opções abaixo e passar 2 números para o processamento.
//Somar
//Subtrair
//Dividir -> não permitir divisão por ZERO
//Multiplicar
//Resto
//Raiz
//Potência

public class Quest02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean condicaoDeParada = true;
        int operacao;
        double numero1;
        double numero2;
        double result;

        while (condicaoDeParada) {

            System.out.println("##Calculadora##");
            System.out.println("____________________");
            System.out.println("0 - ENCERRAR");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - RESTO");
            System.out.println("5 - DIVISÃO");
            System.out.println("6 - RAIZ QUADRADA");
            System.out.println("7 - POTENCIAÇÃO");
            System.out.println("____________________");

            System.out.print("Escolha a operação: ");
            operacao = input.nextInt();

            switch (operacao) {
                case 0 -> condicaoDeParada = false;
                case 1 -> {
                    System.out.println("--SOMA--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    result = numero1 + numero2;
                    System.out.printf("Resultado = %.2f%n", result);
                }
                case 2 -> {
                    System.out.println("--SUBTRAÇÃO--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    result = numero1 - numero2;
                    System.out.printf("Resultado = %.2f%n", result);
                }
                case 3 -> {
                    System.out.println("--MULTIPLICAÇÃO--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    result = numero1 * numero2;
                    System.out.printf("Resultado = %.2f%n", result);
                }
                case 4 -> {
                    System.out.println("--RESTO--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    result = numero1 % numero2;
                    System.out.println("Resultado = " + result);
                }
                case 5 -> {
                    System.out.println("--DIVISÃO--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    if (numero2 == 0) {
                        System.out.println("Divisão por zero não permitida");
                    } else {
                        result = numero1 / numero2;
                        System.out.printf("Resultado = %.2f%n", result);
                    }
                }
                case 6 -> {
                    System.out.println("--RAIZ QUADRADA--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Segundo número: ");
                    numero2 = input.nextDouble();
                    if (numero1 < 0 || numero2 < 0) {
                        System.out.println("Raiz quadrada de número negativo não existe.");
                    } else {
                        result = Math.sqrt(numero1);
                        System.out.printf("Resultado do primeiro número = %.2f%n", result);
                        result = Math.sqrt(numero2);
                        System.out.printf("Resultado do segundo número = %.2f%n", result);
                    }
                }
                case 7 -> {
                    System.out.println("--POTENCIAÇÃO--");
                    System.out.print("Primeiro número: ");
                    numero1 = input.nextDouble();
                    System.out.print("Elevado a: ");
                    numero2 = input.nextDouble();
                    result = Math.pow(numero1, numero2);
                    System.out.printf("Resultado = %.2f%n", result);
                }
            }
        }
        input.close();
    }
}
