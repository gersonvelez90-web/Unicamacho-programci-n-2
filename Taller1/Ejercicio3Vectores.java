import java.util.Scanner;

public class Ejercicio3Vectores {
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
    }
}
