package CodingTank;

import java.util.Scanner;

public class AdaQ02 {

    public static void main(String[] args){

        /*
        *
        * Dada a nota informada pelo aluno, exiba se ele está:
        *
        * Aprovado (média >= 7)
        * Prova Final (média entre 6 e 6.9)
        * Reprovado (média abaixo de 6)
        *
        */

        Scanner scanner = new Scanner(System.in);
        double media;

        System.out.print("Digite sua média: ");
        media = scanner.nextDouble();

        if(media >= 7){
            System.out.println("Aprovado!");
        }else if(media >= 6){
            System.out.println("Prova final!");
        }else if(media < 6){
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
