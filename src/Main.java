public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 20);
        alumno1.adicionaAsignatura(new Asignatura("Matemáticas", 3.5));
        alumno1.adicionaAsignatura(new Asignatura("Física", 4.5));

        Alumno alumno2 = new Alumno("Pedro", 19);
        alumno2.adicionaAsignatura(new Asignatura("Lenguaje", 3.8));
        alumno2.adicionaAsignatura(new Asignatura("Algoritmos II", 4.0));
        alumno2.adicionaAsignatura(new Asignatura("Inglés", 3.0));

        System.out.println("El promedio de " + alumno1.getNombre() + " es: " + alumno1.calcularPromedio());
        System.out.println("El promedio de " + alumno2.getNombre() + " es: " + alumno2.calcularPromedio());

        System.out.println(alumno1);
        System.out.println(alumno1);


        System.out.println(alumno2);
    }
}