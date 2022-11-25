package Ejercicio1;

public class Jugador {
    private String nombre;
    private String apellido;
    private double estatura;
    private int edad;
    private double velocidad;
    private double salto;
    private double peso;
    private double envergadura;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, double estatura, int edad, double velocidad, double salto, double peso, double envergadura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
        this.edad = edad;
        this.velocidad = velocidad;
        this.salto = salto;
        this.peso = peso;
        this.envergadura = envergadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getSalto() {
        return salto;
    }

    public void setSalto(double salto) {
        this.salto = salto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
    
    

    @Override
    public String toString() {
        return   "               "+nombre  +" "+ apellido + "                "+ estatura  +"      "+ edad +  "        "+velocidad + "                        "+salto + "               "+ peso + "          "+envergadura ;
    }
    
    
    
}
