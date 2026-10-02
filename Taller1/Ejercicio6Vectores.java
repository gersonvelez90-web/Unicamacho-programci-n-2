import java.util.Scanner;

public class Ejercicio6Vectores {
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

        // Se recorre del ultimo al primero sin modificar el vector original
        System.out.print("Vector en orden inverso: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
