package CodingTank;

import java.util.Scanner;

public class AdaQ05 {
    public static void main(String[] args){

        int cont = 1;
        int num;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a tabuada que deseja ver: ");
        num = scanner.nextInt();

        while(cont <= 10){
            result = num * cont;
            System.out.printf("%d x %d = %d\n", num, cont, result);
            cont++;
        }
    }
}
