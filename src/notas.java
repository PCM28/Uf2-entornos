import java.util.Scanner;

/**
 * Clase que permite administrar las notas de un estudiante: ingresarlas, validarlas, calcular promedios y mostrarlas.
 */
public class notas {

    // Declaramos las variables necesarias
    /** Nota unidad formativa 1 */
    double notaUf1;

    /** Nota unidad formativa 2 */
    double notaUf2;

    /** Nota unidad formativa 3 */
    double notaUf3;

    /** Acumulado nota 1 (35%) */
    double totalAcu1;

    /** Acumulado nota 2 (35%) */
    double totalAcu2;

    /** Acumulado nota 3 (30%) */
    double totalAcu3;

    /** Nota final */
    double notaFinal;

    /** Scanner: entrada de datos por consola */
    Scanner entrada = new Scanner(System.in);

    /**
     * Método: Ingresar notas del estudiante.
     */
    public void IngresarNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        notaUf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        notaUf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        notaUf3 = entrada.nextDouble();
    }

    /**
     * Método: Comprobar rango válido 0 a 10 de las notas
     */
    public void ComprobarNotas() {
        if (notaUf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (notaUf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (notaUf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método: Calcular acumulados y nota final.
     */
    public void CalcularNotas() {
        totalAcu1 = notaUf1 * 0.35;
        totalAcu2 = notaUf2 * 0.35;
        totalAcu3 = notaUf3 * 0.30;
        notaFinal = totalAcu1 + totalAcu2 + totalAcu3;
        // Nota calculada pero aún no mostrada
    }

    /**
     * Método: Mostrar notas, acumulados y nota final.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas son:");
        System.out.println("Nota 1 = " + notaUf1);
        System.out.println("Nota 2 = " + notaUf2);
        System.out.println("Nota 3 = " + notaUf3);
        System.out.println("Acumulado 1 = " + totalAcu1);
        System.out.println("Acumulado 2 = " + totalAcu2);
        System.out.println("Acumulado 3 = " + totalAcu3);
        System.out.println("Nota definitiva = " + notaFinal);
    }

    /**
     * Método: Calcula si está aprobado, suspendido o si hay un error.
     */
    public void aprobado() {
        if (notaFinal < 5 && notaFinal >= 0) {
            System.out.println("Suspendido");
        } else {
            if (notaFinal >= 5 && notaFinal <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Método: Ejecutar el programa.
     *
     * @param args Argumentos no utilizados - El método acepta argumentos por consola, pero no los estamos usando
     */
    public static void main(String[] args) {
        // Se crea el objeto y llamamos a sus métodos
        notas fc = new notas();
        fc.IngresarNotas();
        fc.ComprobarNotas();
        fc.CalcularNotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
