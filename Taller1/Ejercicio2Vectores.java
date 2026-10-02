import java.util.Scanner;

public class Ejercicio2Vectores {
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

        // Se acumula la suma de todos los elementos
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }

        // El promedio se guarda en un double para que no se trunque
        double promedio = suma;
        promedio = promedio / n;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
