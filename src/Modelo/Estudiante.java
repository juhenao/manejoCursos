package Modelo;

/**
 * Esta clase representa estudiantes
 * @author Juan Henao
 * @version 1.0
 */
public class Estudiante extends Curso{
    // Asignación de atributos
    private int codigo;
    private String nombre;
    private String apellido;

    // Creación de constructores
    /**
     * Se crea una instancia (constructor) del objeto Estudiante
     * @param nombre Nombre del estudiante
     * @param apellido Apellido dele estudiante
     * @param codigo Codigo del estudiante
     */
    public Estudiante(String nombre, String apellido, int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    // Creación de los metodos
    /**
     * Se asignan los cursos al estudiante
     * @param curso Objeto de tipo Curso
     * @return Retorna 'false' si el estudiante no toma el curso y 'true' si el estudiante toma el curso
     */
    public boolean asignarCurso(Curso curso){
        return false;
    }

    /**
     * Calcula el promedio del estudinate
     * @return Retorna el resultado del promedio
     */
    public double calcularPromedio(){
        return 0;
    }

    /**
     *
     * @param codigoCurso
     * @return
     */
    public boolean pensumIncluyeCurso(String codigoCurso){
        return false;
    }

    /**
     * Dice si el estudiante está a prueba o no
     * @return Retorna 'false' si el estudiante no está a prueba, retorna 'true' si el estudinate esta a prueba.
     */
    public boolean estudianteEstaPrueba(){
        return false;
    }

    /**
     * Dice si el estudiante tiene algún curso completo
     * @param codigoCurso Codigo del curso que está completo
     * @return Retorna 'false' si no tiene el curso completo, retorna 'true' si el curso está completo.
     */
    public boolean tieneCursosCompletos(String codigoCurso){
        return false;
    }

    /**
     * Retorna el codigo del estudiante
     * @return Cordigo del estudiante
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Retorna el nombre del estudiante
     * @return Nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el apellido del estudiante
     * @return Apellido del estudiante
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Crea una instancia del curso 1 del estudinate y lo retorna
     * @return Curso 1
     */
    public Curso getCurso1(){
        Curso curso1 = new Curso();
        return curso1;
    }

    /**
     * Crea una instancia del curso 2 del estudinate y lo retorna
     * @return Curso 2
     */
    public Curso getCurso2(){
        Curso curso2 = new Curso();
        return curso2;
    }

    /**
     * Crea una instancia del curso 2 del estudinate y lo retorna
     * @return Curso 2
     */
    public Curso getCurso3(){
        Curso curso3 = new Curso();
        return curso3;
    }

    /**
     * Crea una instancia del curso 2 del estudinate y lo retorna
     * @return Curso 2
     */
    public Curso getCurso4(){
        Curso curso4 = new Curso();
        return curso4;
    }

    /**
     * Crea una instancia del curso 2 del estudinate y lo retorna
     * @return Curso 2
     */
    public Curso getCurso5(){
        Curso curso5 = new Curso();
        return curso5;
    }
}
