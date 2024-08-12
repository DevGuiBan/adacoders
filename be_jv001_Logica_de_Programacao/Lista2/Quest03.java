package be_jv001_Logica_de_Programacao.Lista2;

//Receba X notas e calcule a média. (O usuário vai dizer a quantidade de valores que quer calcular)

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeDeNotas;
        double somando = 0;
        double result;

        System.out.println("Quantas notas deseja adicionar: ");
        quantidadeDeNotas = input.nextInt();

        double[] notas = new double[quantidadeDeNotas];

        for (int i = 0; i < quantidadeDeNotas; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = input.nextDouble();
            somando += notas[i];
        }

        result = somando/quantidadeDeNotas;
        System.out.println("MÉDIA: " + result);
    }
}
