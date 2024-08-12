package be_jv001_Logica_de_Programacao.Aulas;

import java.util.Scanner;

public class PT2_Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean fome = false;
        String condicao;

        System.out.print("Digite sua condição: ");
        condicao = scanner.nextLine();

        if(condicao.equals("Barriga roncando")){
            fome = true;
        }

        if(fome == true){
            System.out.println("Intervalo por favor!!!");
            System.out.println("Combustivel vital em falta!!! :'(");
        }else{
            System.out.println("Pode continuar nobreza <3");
        }

    }
}
