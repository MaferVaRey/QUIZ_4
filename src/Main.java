import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase principal
 */
public class Main {
    /**
     * Método ejecutado primero
     *
     * @param args
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double promedio;
        int edad;


        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + " ingrese las tres notas a continuación");
        double notaMateria1 = sc.nextDouble();
        double notaMateria2 = sc.nextDouble();
        double notaMateria3 = sc.nextDouble();
        LocalDate fechaNacmiento;

        Estudiante estudiante = new Estudiante(nombre, notaMateria1, notaMateria2, notaMateria3);
        fechaNacmiento = estudiante.leerFecha();
        promedio = estudiante.getPromedio(notaMateria1, notaMateria2, notaMateria3);
        edad = estudiante.getEdad(fechaNacmiento);
        estudiante.imprimir(edad, promedio);
    }
}