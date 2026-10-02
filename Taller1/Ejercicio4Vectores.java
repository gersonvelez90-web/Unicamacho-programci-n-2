import java.util.Scanner;

public class Ejercicio4Vectores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Ingrese la cantidad N de elementos del vector (mayor que 0): ");
            n = entrada.nextInt();
        } while (n < 1);

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento [" + i + "]: ");
            vector[i] = entrada.nextInt();
        }

        int pares = 0;
        int impares = 0;

        // Un numero es par si el residuo de dividirlo entre 2 es 0
        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
