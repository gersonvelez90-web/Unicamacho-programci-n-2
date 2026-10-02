import java.util.Scanner;

public class Ejercicio1Matrices {
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

        // El ciclo externo recorre las filas y el interno las columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Se muestra la matriz en forma de tabla, una fila por linea
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
