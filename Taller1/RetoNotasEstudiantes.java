import java.util.Scanner;

public class RetoNotasEstudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // a) Captura de estudiantes, materias y calificaciones
        int estudiantes = 0;
        do {
            System.out.print("Ingrese el numero de estudiantes (mayor que 0): ");
            estudiantes = entrada.nextInt();
        } while (estudiantes < 1);

        int materias = 0;
        do {
            System.out.print("Ingrese el numero de materias (mayor que 0): ");
            materias = entrada.nextInt();
        } while (materias < 1);

        // Filas = estudiantes, columnas = materias
        // Las notas decimales se escriben segun la configuracion del equipo (en espanol: 4,5)
        double[][] notas = new double[estudiantes][materias];

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < materias; j++) {
                System.out.print("Nota del estudiante " + (i + 1) + " en la materia " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
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
            System.out.println("Estudiante " + (i + 1) + ": " + promedioEstudiante);
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
        System.out.println("La materia con el promedio mas alto es la materia " + (materiaMayorPromedio + 1) + " con " + mayorPromedioMateria);

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
        System.out.println("La calificacion mas alta es " + notaMaxima + ", del estudiante " + (estudianteMaximo + 1) + " en la materia " + (materiaMaxima + 1));
    }
}
