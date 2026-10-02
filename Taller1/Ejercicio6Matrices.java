import java.util.Scanner;

public class Ejercicio6Matrices {
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

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
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
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
