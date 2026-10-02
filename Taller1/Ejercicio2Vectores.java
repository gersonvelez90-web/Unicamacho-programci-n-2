import java.util.Scanner;

public class Ejercicio2Vectores {
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

        // Se acumula la suma de todos los elementos
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }

        // Se convierte a double para que el promedio no se trunque
        double promedio = (double) suma / n;

        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);

        sc.close();
    }
}
