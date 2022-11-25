package Ejercicio2y3;

public class InformacionCurso {

    private String nombre;
    private String periodo;
    private String carrera;
    private String modalidad;
    private int codigoCurso;
    private String grupo;
    private String codigoAsignatura;
    private String codigoPrograma;
    private int cantidadEstudiantes;
    private int primerP;
    private int segudoP;
    private int sistematicos;
    private int proyecto;
    public InformacionCurso() {
    }

    public InformacionCurso(String nombre, String periodo, String carrera, String modalidad, int codigoCurso, String grupo, String codigoAsignatura, String codigoPrograma, int cantidadEstudiantes, int primerP, int segudoP, int sistematicos, int proyecto) {
        this.nombre = nombre;
        this.periodo = periodo;
        this.carrera = carrera;
        this.modalidad = modalidad;
        this.codigoCurso = codigoCurso;
        this.grupo = grupo;
        this.codigoAsignatura = codigoAsignatura;
        this.codigoPrograma = codigoPrograma;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.primerP = primerP;
        this.segudoP = segudoP;
        this.sistematicos = sistematicos;
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getPrimerP() {
        return primerP;
    }

    public void setPrimerP(int primerP) {
        this.primerP = primerP;
    }

    public int getSegudoP() {
        return segudoP;
    }

    public void setSegudoP(int segudoP) {
        this.segudoP = segudoP;
    }

    public int getSistematicos() {
        return sistematicos;
    }

    public void setSistematicos(int sistematicos) {
        this.sistematicos = sistematicos;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    

    @Override
    public String toString() {
        return "Informacion del Curso \n"
                + "curso:     " + nombre  +   "   codigo de Curso:         " + codigoCurso         +"   primer  parcial:     "+primerP+"\n"
                + "periodo:   " + periodo +   "   grupo:                   " + grupo               +"   segundo parcial:     "+segudoP+"\n"
                + "carrera:   " + carrera +   "   codigo de la Asignatura: " + codigoAsignatura    +"   sistematicos:        "+sistematicos+"\n"
                + "modalidad: " + modalidad + "   codigo del Programa:     " + codigoPrograma      +"   proyecto:            " + proyecto+"\n";        
    }

}
