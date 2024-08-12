package be_jv001_Logica_de_Programacao.Lista2;

//Dado um inteiro, X, execute as seguintes ações condicionais:
//Se X for ímpar, imprima Weird
//Se X for par e estiver no intervalo inclusivo de 2 a 5, imprima Not Weird
//Se X for par e estiver no intervalo inclusivo de 6 a 20, imprima Weird
//Se X for par e maior que 20, imprima Not Weird

public class Quest01 {
    public static void main(String[] args) {
        int X = 2;

        if(X % 2 != 0){
            System.out.println("Weird");
        }else if(X >= 2 && X <= 5){
            System.out.println("Not Weird");
        }else if(X >= 6 && X <= 20){
            System.out.println("Weird");
        }else if(X > 20){
            System.out.println("Not Weird");
        }
    }
}
