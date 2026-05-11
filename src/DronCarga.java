public class DronCarga extends Dron {
    private double costoPorKg;

    public DronCarga(){
    }

    public double getCostoPorKg(){
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg){
        this.costoPorKg = costoPorKg;
    }

    //Vamos con los overrrides o sobreescritura
    @Override
    public double calcularCostoEntrega() {
        return costoBase +
                (getDistanciaKm() * 0.70) + (getPesoPaquete() * costoPorKg);
    }

    @Override
    public boolean validarDatos(){
        return getPesoPaquete()  <= 30 && getHorasVuelo() <= 5;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Costo entrega: " + calcularCostoEntrega());
    }
}


