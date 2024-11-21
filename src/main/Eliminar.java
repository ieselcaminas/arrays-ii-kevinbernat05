import java.util.Arrays;

public class Eliminar {
    public static int[] eliminar(int[] numeros, int x) {

        int guardada = numeros[x];

        for (int i = x; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }

        numeros[numeros.length - 1] = guardada;
        return numeros;
    }
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        int x = main.Utilidades.leerEntero("Introduzca x: ");

        System.out.println(Arrays.toString(eliminar(numeros, x)));
    }
}

