package Modelo;

/**
 * Esta clase representa estudiantes
 * @author Juan Henao
 * @version 1.0
 */
public class Estudiante{
    // Asignación de atributos
    private int codigo;
    private String nombre;
    private String apellido;
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;

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

        /* this.curso1 = new Curso("#001", "Programación Java POO", 4);
        this.curso2 = new Curso("#002", "Bases de datos MYSQL", 4);
        this.curso3 = new Curso("#003", "Lógica de programación", 3);
        this.curso4 = new Curso("#004", "Matemáticas básicas", 3);
        this.curso5 = new Curso("#005", "Ingles Técnico", 2); */
    }

    // Creación de los metodos
    /**
     * Se asignan los cursos al estudiante
     * @param curso Objeto de tipo Curso
     * @return Retorna 'false' si el estudiante ya tiene todos los cursos registrados y 'true' si el estudiante toma el curso ese curso
     */
    public boolean asignarCurso(Curso curso){
        if(this.curso1 == null){
            this.curso1 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos(), curso.getDescripcion());
            System.out.println("Curso " + curso.getNombreCurso() + " está regitrado");
            return true;
        }

        if(this.curso2 == null){
            this.curso2 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos(), curso.getDescripcion());
            System.out.println("Curso " + curso.getNombreCurso() + " está regitrado");;
            return true;
        }

        if(this.curso3 == null){
            this.curso3 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos(), curso.getDescripcion());
            System.out.println("Curso " + curso.getNombreCurso() + " está regitrado");
            return true;
        }

        if(this.curso4 == null){
            this.curso4 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos(), curso.getDescripcion());
            System.out.println("Curso " + curso.getNombreCurso() + " está regitrado");
            return true;
        }

        if(this.curso5 == null){
            this.curso5 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos(), curso.getDescripcion());
            System.out.println("Curso " + curso.getNombreCurso() + " está regitrado");
            return true;
        }

        System.out.println("Ya tiene los cursos registrados.");
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
     * Dice si el estudiante está cursando ese curso
     * @param codigoCurso Codigo del curso
     * @return 'true' si está cursando el curso buscado, 'false' si no lo cursa
     */
    public boolean pensumIncluyeCurso(String codigoCurso){
        if(buscarCurso(codigoCurso) != null){
            System.out.println("El estudiante tiene el curso: " + buscarCurso(codigoCurso).getNombreCurso());
            return true;
        } else {
            System.out.println("El estudiante no está cursando este curso");
            return false;
        }
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
     * Busca un curso que el estudiante esté tomando
     * @param codigoCurso Codigo del curso
     * @return Retona el objeto del curso si este se está tomando
     */
    public Curso buscarCurso(String codigoCurso){
        if(codigoCurso == curso1.getCodigoCurso()){
            return curso1;
        }

        if(codigoCurso == curso2.getCodigoCurso()){
            return curso2;
        }

        if(codigoCurso == curso3.getCodigoCurso()){
            return curso3;
        }

        if(codigoCurso == curso4.getCodigoCurso()){
            return curso4;
        }

        if(codigoCurso == curso5.getCodigoCurso()){
            return curso5;
        }

        System.out.println("El curso no se ha encontrado.");
        return null;
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
}
