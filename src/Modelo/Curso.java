package Modelo;

/**
 * Esta clase representa los cursos.
 * @author Juan Henao.
 * @version 1.0
 */
public class Curso {
    // Asignación de atributos
    private String codigoCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;

    // Creación de constructores

    /**
     * Se crea una instancia (constructor) del objeto Curso
     * @param cod Codigo del curso
     * @param nom Nombre del curso
     * @param cred Creditos del curso
     */
    public Curso(String cod, String nom, int cred){
        this.codigoCurso = cod;
        this.nombreCurso = nom;
        this.creditos = cred;
    }

    // Creacion de metodos

    /**
     * Retorna el el numero de creditos del curso
     * @return Retorna creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Asigna el valor de los creditos
     * @param creditos Numero de creditos del curso
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Retorna el valor de la nota del curso
     * @return Retona la nora
     */
    public double getNota() {
        return nota;
    }

    /**
     * Asigna el valor de la nota del curso
     * @param nota Valor de la nota del curso
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * Retorna el nombre del curso
     * @return Nombre del curso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Retorna la descripcion del curso
     * @return Descripcion del curso
     */
    public String getDescripcion(){
        return "Descripción del curso";
    }

    /**
     * Retona si el curso esta o no calificado
     * @return 'true' si esta calificado, 'false' si no esta calificado
     */
    public boolean estaCalificado(){
        return false;
    }
}
