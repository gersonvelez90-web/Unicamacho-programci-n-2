import java.util.Scanner;

public class Ejercicio2Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int filas = 0;
        do {
            System.out.print("Ingrese el numero de filas (mayor que 0): ");
            filas = entrada.nextInt();
        } while (filas < 1);

        int columnas = 0;
        do {
            System.out.print("Ingrese el numero de columnas (mayor que 0): ");
            columnas = entrada.nextInt();
        } while (columnas < 1);

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Se acumulan todos los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];
            }
        }

        System.out.println("Suma total de la matriz: " + suma);
    }
}
