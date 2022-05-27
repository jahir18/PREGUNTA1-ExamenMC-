package Pregunta1;

public class Semestre {

    private int semestre;

    private Estudiante[] estudiante;

    private int contador;

    public Semestre(int semestre) {

        this.semestre = semestre;

        this.contador = 0;

        this.estudiante = new Estudiante[1];
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setEstudiante(Estudiante estudiante) {

        this.estudiante[this.contador++] = estudiante;
    }

    public Estudiante[] getEstudiante() {

        return estudiante;
    }

}
