import java.util.Scanner;

public class Ejercicio5Vectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad N de elementos del vector: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("N debe ser mayor que 0. Ingrese N de nuevo: ");
            n = sc.nextInt();
        }

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento [" + i + "]: ");
            vector[i] = sc.nextInt();
        }

        System.out.print("Ingrese el valor a buscar: ");
        int buscado = sc.nextInt();

        // posicion = -1 significa que todavia no se ha encontrado el valor
        int posicion = -1;

        // El ciclo se detiene cuando se encuentra la primera aparicion
        for (int i = 0; i < n && posicion == -1; i++) {
            if (vector[i] == buscado) {
                posicion = i;
            }
        }

        if (posicion == -1) {
            System.out.println("El valor " + buscado + " no existe en el vector.");
        } else {
            System.out.println("El valor " + buscado + " existe y se encuentra en la posicion " + posicion + ".");
        }

        sc.close();
    }
}
