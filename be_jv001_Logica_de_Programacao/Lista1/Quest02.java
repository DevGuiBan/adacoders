package be_jv001_Logica_de_Programacao.Lista1;

import java.util.Scanner;

//Escreva um programa que captura nome, salário, idade, altura e sexo. Mostre na tela utilizando o printf.

public class Quest02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String nome;
        double salario;
        int idade;
        float altura;
        String sexo;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite seu salario: ");
        salario = Double.parseDouble(input.nextLine());
        System.out.print("Digite seu idade: ");
        idade = Integer.parseInt(input.nextLine());
        System.out.print("Digite seu altura: ");
        altura = Float.parseFloat(input.nextLine());
        System.out.print("Digite seu sexo: ");
        sexo = input.nextLine();

        System.out.print("____________________________");
        System.out.printf("%nNome: %s%nSalário: R$%.2f%nidade: %d%naltura: %.2f%nSexo: %s%n", nome, salario, idade, altura, sexo);
        System.out.print("____________________________");
    }
}
