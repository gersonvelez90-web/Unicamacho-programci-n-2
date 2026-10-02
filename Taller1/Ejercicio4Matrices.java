import java.util.Scanner;

public class Ejercicio4Matrices {
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

        sc.close();
    }
}
