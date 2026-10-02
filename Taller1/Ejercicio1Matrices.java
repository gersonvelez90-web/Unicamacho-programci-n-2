import java.util.Scanner;

public class Ejercicio1Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        while (filas <= 0) {
            System.out.print("Las filas deben ser mayor que 0. Ingrese de nuevo: ");
            filas = sc.nextInt();
        }

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();
        while (columnas <= 0) {
            System.out.print("Las columnas deben ser mayor que 0. Ingrese de nuevo: ");
            columnas = sc.nextInt();
        }

        int[][] matriz = new int[filas][columnas];

        // El ciclo externo recorre las filas y el interno las columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Se muestra la matriz en forma de tabla, una fila por linea
        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
