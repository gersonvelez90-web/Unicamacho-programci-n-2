import java.util.Scanner;

public class Ejercicio3Matrices {
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
    }
}
