import java.util.Arrays;

public class Inverso {
    public static int[] inverso(int[] numeros, int[] alreves) {

        for (int i = numeros.length - 1; i >= 0; i--) {
            alreves[numeros.length - 1 - i] = numeros[i];
        }
        return alreves;
    }
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] alreves = new int[numeros.length];

        System.out.println(Arrays.toString(inverso(numeros, alreves)));
    }
}
