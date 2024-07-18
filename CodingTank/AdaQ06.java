package CodingTank;

import java.util.Scanner;

public class AdaQ06 {
    public static void main(String[] args){
        /*
        * Escreva um programa que solicita ao usuário para inserir um número e verifica se esse número é primo ou não.
        *
        * Ao final, perguntar se o usuário deseja repetir. A saída é digitar -1
        */

        int saida = 0;
        int num;
        boolean primo = true;

        Scanner scanner = new Scanner(System.in);

        while(saida != -1){

            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if(num < 2){
                primo = false;
            }else if(num == 2){
                primo = true;
            }else if(num % 2 == 0){
                primo = false;
            }else {
                // Itera sobre todos os números ímpares a partir de 3 até a raiz quadrada do número
                // 'i += 2' tá servindo pra pular os numeros pares e verificar apenas os impares
                for(int i = 3; i <= Math.sqrt(num); i += 2){
                    // Se o número for divisível por qualquer desses números, não é primo
                    if(num % i == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if(primo){
                System.out.println("É primo meu nobre!");
            }else{
                System.out.println("Não é primo lamento!");
            }

            System.out.print("Deseja sair? Digite (-1): ");
            saida = scanner.nextInt();
        }
        scanner.close();
    }
}
