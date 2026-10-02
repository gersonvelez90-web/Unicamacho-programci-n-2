import java.util.Scanner;

public class Ejercicio1Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad N de elementos del vector: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("N debe ser mayor que 0. Ingrese N de nuevo: ");
            n = sc.nextInt();
        }

        int[] vector = new int[n];

        // Captura de cada elemento del vector
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento [" + i + "]: ");
            vector[i] = sc.nextInt();
        }

        // Se muestran todos los elementos en una sola linea
        System.out.print("Vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
