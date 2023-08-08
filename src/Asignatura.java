public class Asignatura {
    // Attributes
    private String nombre;
    private double nota;

    // Constructor
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {//método para consultar el nombre de la asignatura
        return nombre;
    }

    public void setNombre(String nombre) {//método para modificar el nombre de la asignatura
        this.nombre = nombre;
    }

    public double getNota() {//método para consultar la nota de la asignatura
        return nota;
    }

    public void setNota(double nota) {//método para modificar la nota de la asignatura
        this.nota = nota;
    }

    public String consultarNota() {//método para consultar la nota de la asignatura
        if (nota >= 3.5) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                ", estado='" + consultarNota()  ;
    }
}
