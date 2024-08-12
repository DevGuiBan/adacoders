package be_jv001_Logica_de_Programacao.Lista1;

import java.util.Scanner;

//Faça um programa que calcula o IMC

public class Quest05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura;
        double peso;
        double result;

        System.out.println("##Calculadora de IMC##");

        System.out.print("Informe sua altura: ");
        altura = input.nextDouble();
        System.out.print("Informe seu peso: ");
        peso = input.nextDouble();

        result = peso / (altura * altura);

        System.out.printf("IMC: %.2f", result);

        input.close();
    }
}
