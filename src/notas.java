import java.util.Scanner;

/**
 * Clase que permite administrar las notas de un estudiante: ingresarlas, validarlas, calcular promedios y mostrarlas.
 */
public class notas {

    // Declaramos las variables necesarias
    /** Nota unidad formativa 1 */
    double uf1;

    /** Nota unidad formativa 2 */
    double uf2;

    /** Nota unidad formativa 3 */
    double uf3;

    /** Acumulado nota 1 (35%) */
    double acu1;

    /** Acumulado nota 2 (35%) */
    double acu2;

    /** Acumulado nota 3 (30%) */
    double acu3;

    /** Nota final */
    double def;

    /** Scanner: entrada de datos por consola */
    Scanner entrada = new Scanner(System.in);

    /**
     * Método: Ingresar notas del estudiante.
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Método: Comprobar rango válido 0 a 10 de las notas
     */
    public void comprobarcion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método: Calcular acumulados y nota final.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
        // Nota calculada pero aún no mostrada
    }

    /**
     * Método: Mostrar notas, acumulados y nota final.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas son:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Método: Calcula si está aprobado, suspendido o si hay un error.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else {
            if (def >= 5 && def <= 10) {
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
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
