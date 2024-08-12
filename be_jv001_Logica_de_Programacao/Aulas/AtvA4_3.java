package be_jv001_Logica_de_Programacao.Aulas;

public class AtvA4_3 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        inverter(array);

        for (char i : array) {
            System.out.println(i);
        }
    }

    public static void inverter(char[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    }
}