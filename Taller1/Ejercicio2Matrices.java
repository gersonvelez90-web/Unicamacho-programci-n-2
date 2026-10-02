import java.util.Scanner;

public class Ejercicio2Matrices {
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

        // Se acumulan todos los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + matriz[i][j];
            }
        }

        System.out.println("Suma total de la matriz: " + suma);

        sc.close();
    }
}
