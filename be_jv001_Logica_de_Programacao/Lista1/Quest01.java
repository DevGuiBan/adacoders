package be_jv001_Logica_de_Programacao.Lista1;

import java.util.Scanner;

/*
 * Escreva um programa que captura nome, idade e profissão do usuário e mostra na tela os valores.
 * (Utilize a classe Scanner e os 3 métodos print, printf e println).
 */

public class Quest01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        String profissao;

        System.out.println("##Informe seus dados##");

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(input.nextLine());

        System.out.print("Digite sua profissão: ");
        profissao = input.nextLine();

        System.out.printf("Nome: %s%nIdade: %d%nProfissão: %s", nome, idade, profissao);

        input.close();
    }
}
