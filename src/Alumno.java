import java.util.ArrayList;

public class Alumno {
    // Attributes
    private String nombre;
    private int edad;
    private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

    // Constructor
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {//método para consultar el nombre del alumno
        return nombre;
    }

    public void setNombre(String nombre) {//método para modificar el nombre del alumno
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void adicionaAsignatura(Asignatura asignatura) {
        if (asignaturas.contains(asignatura)) {
            System.out.println("La asignatura ya existe");

        } else {
            asignaturas.add(asignatura);
        }//fin if

    }//fin del método adicionaAsignatura

    public double calcularPromedio() {
        double promedio = 0;
        for (Asignatura asignatura : asignaturas) {
            promedio += asignatura.getNota();
        }//fin del for
        return promedio / asignaturas.size();
    }//fin del método calcularPromedio

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas +
                '}';
    }
}//fin de la clase Alumno
