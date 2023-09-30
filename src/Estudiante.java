import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Clase Estudiante
 */
public class Estudiante {

    /**
     * Atributos de la clase
     */
    private String nombre;
    private double notaMateria1, notaMateria2, notaMateria3;

    /**
     *
     * @param nombre Recibe el nombre del estudiante
     * @param notaMateria1 Recibe la nota de la primera materia
     * @param notaMateria2 Recibe la nota de la segunda materia
     * @param notaMateria3 Recibe la nota de la tercera materia
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public Estudiante(String nombre, double notaMateria1, double notaMateria2, double notaMateria3) {
        this.nombre = nombre;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
    }

    /**
     * Getters y setters de la calse
     *
     * Complejidad temporal: O(1) complejidad constante
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /**
     *
     * @param notaMateria1 Nota materia 1 para el promedio
     * @param notaMateria2 Nota materia 2 para el promedio
     * @param notaMateria3 Nota materia 3 para el promedio
     * @return Promedio de notas entre las tres materias
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public double Promedio(double notaMateria1, double notaMateria2, double notaMateria3) {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }

    /**
     * @return La fecha de nacimientodel alumno leída en consola
     *
     * COmplejidad temporal: O(1) Complejidad constate
     */
    public LocalDate leerFecha(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa su fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = sc.nextLine();

        return LocalDate.parse(fechaNacimientoStr);
    }

    /**
     *
     * @param fechaNacimiento Fecha de nacimiento del alumno
     * @return Edad del alumno (Entero)
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    /**
     *
     * @param edad Edad del alumno
     * @param promedio Promedio de notas
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public void imprimir(int edad, double promedio){
        System.out.println("Su edad es: ");
        System.out.println(edad);
        System.out.println("Su promedio de notas es: ");
        System.out.println(promedio);
    }
}