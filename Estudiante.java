package Pregunta1;

public class Estudiante {

    private String nombre;

    private Cursos[] cursos;

    private int contador;

    public Estudiante(String nombre) {

        this.nombre = nombre;
        this.contador = 0;
        this.cursos = new Cursos[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCursos(Cursos cursos) {

        this.cursos[this.contador] = cursos;

        this.contador++;
    }

    public Cursos[] getCursos() {
        return cursos;
    }

}