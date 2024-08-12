package be_jv001_Logica_de_Programacao.Lista1;

import java.util.Scanner;

/*
 * Suponha que precisamos trabalhar em um projeto da NASA que pretende lançar um novo satélite.
 * A economia de memória é muito importante nessa missão, pois vamos ter uma quantidade de memória limitada.
 * Vamos trabalhar em 3 módulos e não podemos ultrapassar o limite de memória de cada módulo.
 * Ao iniciar o programa o operador deve digitar os dados da missão para que armazene todos os dados em cada um dos módulos
 * e no final deve ser printado todos os valores por ele escolhidos.
 *
 * Móludo 01 - Controle de tempo x funcionários:
 *
 * Memória disponível: 3 bytes
 * Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
 *
 * Móludo 02 - Controle de distância x velocidade:
 *
 * Memória disponível: 6 bytes
 * Requisitos: Armazenar distancia que o satélite ficará da terra (max 2 milhões), velocidade máxima (max 30.000 km/h)
 *
 * Móludo 03 - Status da missão:
 * Memória disponível: 17 bytes
 * Requisitos: Armazenar o estado da missão (se já iniciou ou não), distância que será percorrida durante a missão em km (max 3 bilhões de km)
 * e calibragem das antenas (número racional com precisão de no mínimo 14 casa decimais).
 */

public class Quest03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Módulo |Max 3 bytes|- 1  (byte + short = 3 bytes)
        byte funcionarios;
        short anoDaMissao;

        //Módulo |Max 6 bytes| - 2 (int + short = 5 bytes)
        int distanciaDoSatelite;
        short velocidade;

        //Módulo |Max 17 bytes| - 3 (boolean + long + double = 17)
        boolean estadoDaMissao;
        long distanciaPercorridaDuranteAMissao;
        double calibragemDasAntenas;

        System.out.print("Informe a quantidade de funcionários: ");
        funcionarios = input.nextByte();

        System.out.print("Ano da missão: ");
        anoDaMissao = input.nextShort();

        System.out.print("Distância do satélite: ");
        distanciaDoSatelite = input.nextInt();

        System.out.print("Velocidade máxima do satélite: ");
        velocidade = input.nextShort();

        System.out.print("Informe o estado da missão (true or false):");
        estadoDaMissao = input.nextBoolean();

        System.out.print("Distancia percorrida durante a missão: ");
        distanciaPercorridaDuranteAMissao = input.nextLong();

        System.out.print("Calibragem das antenas: ");
        calibragemDasAntenas = input.nextDouble();

        System.out.print("-----------------------");
        System.out.println("Funcionários -> " + funcionarios);
        System.out.println("Ano da missão -> " + anoDaMissao);
        System.out.println("Distância do satélite -> " + distanciaDoSatelite);
        System.out.println("Velocidade máxima do satélite -> " + velocidade);
        System.out.println("Estado da missão (true: andamento | false: aguardando)-> " + estadoDaMissao);
        System.out.println("Distância percorrida durante a missão -> " + distanciaPercorridaDuranteAMissao);
        System.out.println("Calibragem das antenas -> " + calibragemDasAntenas);
        System.out.print("-----------------------");

        input.close();
    }
}
