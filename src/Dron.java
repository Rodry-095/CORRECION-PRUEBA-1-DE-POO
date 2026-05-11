public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    //aqui pondre el constructor vacio
    public Dron(){
    }

    //aqui ira el constructor completo
    public Dron(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase){
        this.codigo = codigo;
        this.modelo = modelo;
        this.distanciaKm = distanciaKm;
        this.pesoPaquete = pesoPaquete;
        this.horasVuelo = horasVuelo;
        this.costoBase = costoBase;
    }

    //GETTERS
    public String getCodigo(){
        return codigo;
    }

    public String getModelo(){
        return modelo;
    }

    public double getDistanciaKm(){
        return  distanciaKm;
    }

    public double getPesoPaquete(){
        return pesoPaquete;
    }

    public double getHorasVuelo(){
        return horasVuelo;
    }

    public double getCostoBase(){
        return costoBase;
    }

    //SETTERS
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setDistanciaKm(double distanciaKm){
        this.distanciaKm = distanciaKm;
    }

    public void setPesoPaquete(double pesoPaquete){
        this.pesoPaquete = pesoPaquete;
    }

    public void setHorasVuelo(double horasVuelo){
        this.horasVuelo = horasVuelo;
    }

    //Aqui van los metodos abstractos
    public abstract double calcularCostoEntrega();
    public abstract  boolean validarDatos();

    //el metodo concreto o en general
    public void mostrarInformacion(){
        System.out.println("Código: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia: " + distanciaKm);
        System.out.println("Peso: " + pesoPaquete);
        System.out.println("Horas vuelo: " + horasVuelo);
        System.out.println("Costo base: " + costoBase);
    }

}
