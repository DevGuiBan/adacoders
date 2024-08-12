package be_jv001_Logica_de_Programacao.Aulas;

// Atividade 01 - Calculadora com menu e 5 opcoes (soma, sub, div, mult, sair)
// O usuarido vai dizer 2 numeros inteiros.

// Atividade 02 - Carro com menu e 4 opcoes (acelerar +10km, frear -10km, ligar e desligar)
// - o loop while termina quando o carro é deligado
// - o carro só podera ser desligado se sua velocidade for igual a zero
// - o carro não pode ter uma velocidade negativa

import java.util.Scanner;

public class AtvA3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        int velocidade = 0;

        while (true) {

            System.out.println("Ligar -> 0");
            System.out.println("Desligar -> 1");
            System.out.println("Acelerar -> 2");
            System.out.println("Frear -> 3");

            System.out.print("Digite aqui: ");
            option = input.nextInt();

            if (option == 0) {
                System.out.println("Carro ligado");
            } else if (option == 1) {
                if (velocidade != 0) {
                    System.out.println("Carro em movimento reduza!!!");
                } else {
                    System.out.println("Desligando carro!");
                    break;
                }
            } else if (option == 2) {
                velocidade = velocidade + 10;
                System.out.println("Velociade: " + velocidade);
            } else if (option == 3) {
                if (velocidade <= 0) {
                    System.out.println("O carro já está parado.");
                } else {
                    velocidade = velocidade - 10;
                    System.out.println("Velocidade: " + velocidade);
                }
            }
        }
    }
}