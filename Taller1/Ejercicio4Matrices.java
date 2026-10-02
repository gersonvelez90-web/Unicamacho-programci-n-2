import java.util.Scanner;

public class Ejercicio4Matrices {
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

        // Se parte del primer elemento como mayor y se guarda su posicion
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }

        System.out.println("Valor mayor: " + mayor);
        System.out.println("Fila: " + filaMayor);
        System.out.println("Columna: " + columnaMayor);
    }
}
