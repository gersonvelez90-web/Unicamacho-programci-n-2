import java.util.Scanner;

public class Ejercicio6Matrices {
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

        // La transpuesta tiene las dimensiones invertidas: columnas x filas
        int[][] transpuesta = new int[columnas][filas];

        // El elemento [i][j] de la original pasa a la posicion [j][i]
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
