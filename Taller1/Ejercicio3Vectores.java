import java.util.Scanner;

public class Ejercicio3Vectores {
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

        // Se parte del primer elemento como mayor y menor
        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < n; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);

        sc.close();
    }
}
