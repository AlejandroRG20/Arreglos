package Ejercicio2y3;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String carnet;
    private double primerP;
    private double segundoP;
    private double sistematicos;
    private double proyecto;
    private double Iconv;
    private double IIconv;
    private double NF;
    private double NFI;
    private String apr;
    private String des;
    public Estudiante() {
    }

    public Estudiante(String carnet,String nombre, String apellido,  double primerP, double segundoP, double sistematicos, double proyecto, double NF,double Iconv,double NFI, double IIconv,   String apr, String des) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.primerP = primerP;
        this.segundoP = segundoP;
        this.sistematicos = sistematicos;
        this.proyecto = proyecto;
        this.Iconv = Iconv;
        this.IIconv = IIconv;
        this.NF = NF;
        this.NFI = NFI;
        this.apr = apr;
        this.des = des;
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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPrimerP() {
        return primerP;
    }

    public void setPrimerP(double primerP) {
        this.primerP = primerP;
    }

    public double getSegundoP() {
        return segundoP;
    }

    public void setSegundoP(double segundoP) {
        this.segundoP = segundoP;
    }

    public double getSistematicos() {
        return sistematicos;
    }

    public void setSistematicos(double sistematicos) {
        this.sistematicos = sistematicos;
    }

    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

    public double getIconv() {
        return Iconv;
    }

    public void setIconv(double Iconv) {
        this.Iconv = Iconv;
    }

    public double getIIconv() {
        return IIconv;
    }

    public void setIIconv(double IIconv) {
        this.IIconv = IIconv;
    }

    public double getNF() {
        return NF;
    }

    public void setNF(double NF) {
        this.NF = NF;
    }

    public double getNFI() {
        return NFI;
    }

    public void setNFI(double NFI) {
        this.NFI = NFI;
    }

    public String getApr() {
        return apr;
    }

    public void setApr(String apr) {
        this.apr = apr;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    
    
    @Override
    public String toString() {
        return "        " + carnet  + "         " + nombre + " " + apellido + "          " + primerP + "     " + segundoP + "     " + sistematicos + "      " 
                          + proyecto+ "      " + NF + "     " + Iconv + "      "  + NFI+ "      " + IIconv+ "     "+apr+"    "+des;
    }

}
