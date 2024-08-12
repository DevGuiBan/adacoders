package be_jv001_Logica_de_Programacao.Aulas;

// 1 - dado um array de numeros inteiros, calcular sua média

public class AtvA4_2 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        double media = calcularMedia(numeros);
        System.out.println("A média dos números é: " + media);
    }

    public static double calcularMedia(int[] array) {
        int soma = 0;

        for (int numero : array) {
            soma = soma + numero;
        }

        return (double) soma / array.length;
    }
}