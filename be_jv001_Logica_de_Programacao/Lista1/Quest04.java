package be_jv001_Logica_de_Programacao.Lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

//Faça um programa que calcula a área das seguites figuras geometricas - Retângulo, Triângulo, Círculo e Trapézio.

public class Quest04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int forma;
        final double PI = 3.1415;
        boolean condicaoDeParada = true;

        while(condicaoDeParada){
            System.out.println("###Calculadora de Área###");

            System.out.println("__________________");
            System.out.println("RETÂNGULO - 1");
            System.out.println("TRIÂNGULO - 2");
            System.out.println("CÍRCULO - 3");
            System.out.println("TRAPÉZIO - 4");
            System.out.println("Encerrar - 0");
            System.out.println("__________________");

            System.out.print("Escolha a forma geometrica desejada: ");
            forma = input.nextInt();

            switch (forma) {
                case 0 -> condicaoDeParada = false;
                case 1 -> {
                    System.out.println("--RETÂNGULO--");

                    System.out.print("Informe a base (em centímetros): ");
                    double base = input.nextDouble();
                    System.out.print("Informe o altura (em centímetros): ");
                    double altura = input.nextDouble();

                    double result = base * altura;

                    System.out.println("Área do Retângulo: " + result + "cm2");
                }
                case 2 -> {
                    System.out.println("--TRIÂNGULO--");

                    System.out.print("Informe a base (em centímetros): ");
                    double base = input.nextDouble();
                    System.out.print("Informe o altura (em centímetros): ");
                    double altura = input.nextDouble();

                    double result = (base * altura) / 2;

                    System.out.println("Área do Triângulo: " + result + "cm2");
                }
                case 3 -> {
                    System.out.println("--CÍRCULO--");

                    System.out.print("Informe o raio do círculo (em centímetros): ");
                    double raio = input.nextDouble();

                    double result = PI * raio * raio;

                    System.out.printf("Área do Círculo: %.2fcm2%n", result);
                }
                case 4 -> {
                    System.out.println("--TRAPÉZIO--");

                    System.out.print("Informe a BASE 1 (em centímetros): ");
                    double base1 = input.nextDouble();
                    System.out.print("Informe a BASE 2 (em centímetros): ");
                    double base2 = input.nextDouble();
                    System.out.print("Informe o altura (em centímetros): ");
                    double altura = input.nextDouble();

                    double result = ((base1 + base2) * altura) / 2;

                    System.out.println("Área do Trapézio: " + result + "cm2");
                }
            }
        }
        input.close();
    }
}
