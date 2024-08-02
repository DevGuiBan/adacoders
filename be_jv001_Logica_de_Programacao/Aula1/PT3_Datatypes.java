package be_jv001_Logica_de_Programacao.Aula1;

public class PT3_Datatypes {
    public static void main(String[] args) {

        // Inteiros
        byte numByte = 1; //1 byte | -128 a 127
        short numShort = 2; // 2 bytes | -32768 a 32767
        long numLong = 4L; // 8 bytes | numeros muito grandes ;----;
        long numLong2 = 7_800_800_000L;

        // BigDecimal

        /*
         * Alta Precisão: BigDecimal permite realizar cálculos com precisão muito alta,
         * o que é crucial para aplicações financeiras e científicas
         * onde erros de arredondamento são inaceitáveis.
         */

        // Ponto flutuante
        float numFloat = 1.55501F; // 4 bytes | 6-7 digitos decimais significativos
        double numDouble = 2.0; // 8 bytes | 15 digitos decimais significativos

        //Especiais
        boolean typeBool = true; // Só pode receber 2 valores;
        boolean typeBool2 = false; // verdadeiro ou falso


        //'final'

        /*
         * A variable declared as final can only be assigned a value once,
         * and that value cannot be changed afterward.
         */
        final double PI = 3.14159;

        //'integer'

        /*
         * Geralmente o tipo primitivo int é mais usado para variáveis simples,
         * enquanto a classe Integer é usada quando você precisa de uma classe objeto,
         * como em coleções (por exemplo, ArrayList<Integer>).
         *
         * Integer em Java pode ser usada para representar valores que podem ser nulos,
         * enquanto o tipo primitivo int não pode.
         * Isso é útil em situações onde um valor inteiro pode não estar presente ou ser desconhecido,
         * pois o tipo primitivo int sempre tem um valor padrão de 0, em sistemas de alta precisão,
         * receber um valor errado pode gerar grandes custos.
         */
        Integer object;
    }
}
