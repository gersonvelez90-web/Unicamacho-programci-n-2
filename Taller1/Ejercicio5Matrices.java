import java.util.Scanner;

public class Ejercicio5Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();

        // La diagonal principal solo se calcula en matrices cuadradas
        while (filas <= 0 || columnas <= 0 || filas != columnas) {
            System.out.println("La matriz debe ser cuadrada (filas = columnas) y mayor que 0.");
            System.out.print("Ingrese el numero de filas: ");
            filas = sc.nextInt();
            System.out.print("Ingrese el numero de columnas: ");
            columnas = sc.nextInt();
        }

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Los elementos de la diagonal principal cumplen que fila == columna
        int sumaDiagonal = 0;
        for (int i = 0; i < filas; i++) {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);

        sc.close();
    }
}
