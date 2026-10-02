import java.util.Scanner;

public class Ejercicio3Matrices {
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

        // Suma de cada fila: se fija la fila i y se recorren sus columnas
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }

        // Suma de cada columna: se fija la columna j y se recorren sus filas
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna = sumaColumna + matriz[i][j];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna);
        }

        sc.close();
    }
}
