package Pregunta1;

public class Main {

    public static void main(String args[]) {

        Cursos curso1 = new Cursos("MATEMATICA 1");
        Cursos curso2 = new Cursos("LENGUAJE 1");
        Cursos curso3 = new Cursos("INGLES 1");

        Docente docente = new Docente("FREDDY CLAYDERMAM VIGILIO ARRATEA");

        Estudiante estudiante = new Estudiante("trujillo Vilcherrez Jahir Anthony");
        estudiante.setCursos(curso1);
        estudiante.setCursos(curso2);
        estudiante.setCursos(curso3);

        Semestre semestre = new Semestre(1);
        System.out.println("Semestre: " + semestre.getSemestre());
        semestre.setEstudiante(estudiante);

        for (Estudiante e : semestre.getEstudiante()) {
            System.out.println("Alumno: " + e.getNombre());

            for (Cursos c : e.getCursos()) {
                System.out.println("Curso: " + c.getCurso() + " - Docente: " + docente.getDocente());

            }

        }

    }

    private static Object getDocente() {
        return null;
    }

}
