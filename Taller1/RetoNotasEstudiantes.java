import java.util.Locale;
import java.util.Scanner;

public class RetoNotasEstudiantes {
    public static void main(String[] args) {
        // Locale.US para que las notas se escriban con punto decimal (ejemplo: 4.5)
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // a) Captura de estudiantes, materias y calificaciones
        System.out.print("Ingrese el numero de estudiantes: ");
        int estudiantes = sc.nextInt();
        while (estudiantes <= 0) {
            System.out.print("Debe ser mayor que 0. Ingrese el numero de estudiantes: ");
            estudiantes = sc.nextInt();
        }

        System.out.print("Ingrese el numero de materias: ");
        int materias = sc.nextInt();
        while (materias <= 0) {
            System.out.print("Debe ser mayor que 0. Ingrese el numero de materias: ");
            materias = sc.nextInt();
        }

        // Filas = estudiantes, columnas = materias
        double[][] notas = new double[estudiantes][materias];

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < materias; j++) {
                System.out.print("Nota del estudiante " + (i + 1) + " en la materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // b) Promedio de cada estudiante (se suma cada fila)
        System.out.println();
        System.out.println("Promedio de cada estudiante:");
        for (int i = 0; i < estudiantes; i++) {
            double sumaEstudiante = 0;
            for (int j = 0; j < materias; j++) {
                sumaEstudiante = sumaEstudiante + notas[i][j];
            }
            double promedioEstudiante = sumaEstudiante / materias;
            System.out.printf(Locale.US, "Estudiante %d: %.2f%n", i + 1, promedioEstudiante);
        }

        // c) Materia con el promedio mas alto (se suma cada columna)
        double mayorPromedioMateria = -1;
        int materiaMayorPromedio = 0;
        for (int j = 0; j < materias; j++) {
            double sumaMateria = 0;
            for (int i = 0; i < estudiantes; i++) {
                sumaMateria = sumaMateria + notas[i][j];
            }
            double promedioMateria = sumaMateria / estudiantes;
            if (j == 0 || promedioMateria > mayorPromedioMateria) {
                mayorPromedioMateria = promedioMateria;
                materiaMayorPromedio = j;
            }
        }
        System.out.println();
        System.out.printf(Locale.US, "La materia con el promedio mas alto es la materia %d con %.2f%n",
                materiaMayorPromedio + 1, mayorPromedioMateria);

        // d) Calificacion mas alta con su estudiante y su materia
        double notaMaxima = notas[0][0];
        int estudianteMaximo = 0;
        int materiaMaxima = 0;
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < materias; j++) {
                if (notas[i][j] > notaMaxima) {
                    notaMaxima = notas[i][j];
                    estudianteMaximo = i;
                    materiaMaxima = j;
                }
            }
        }
        System.out.printf(Locale.US, "La calificacion mas alta es %.2f, del estudiante %d en la materia %d%n",
                notaMaxima, estudianteMaximo + 1, materiaMaxima + 1);

        sc.close();
    }
}
