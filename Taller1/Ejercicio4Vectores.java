import java.util.Scanner;

public class Ejercicio4Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad N de elementos del vector: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("N debe ser mayor que 0. Ingrese N de nuevo: ");
            n = sc.nextInt();
        }

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento [" + i + "]: ");
            vector[i] = sc.nextInt();
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

        sc.close();
    }
}
