import java.util.Scanner;

public class Ejercicio5Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int filas = 0;
        int columnas = 0;

        // La diagonal principal solo se calcula en matrices cuadradas
        do {
            System.out.print("Ingrese el numero de filas (mayor que 0): ");
            filas = entrada.nextInt();
            System.out.print("Ingrese el numero de columnas (igual al numero de filas): ");
            columnas = entrada.nextInt();
        } while (filas < 1 || columnas != filas);

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Los elementos de la diagonal principal cumplen que fila == columna
        int sumaDiagonal = 0;
        for (int i = 0; i < filas; i++) {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}
