public class Main {
    public static void main(String[] args) {

        System.out.println("\n-----SISTEMA DE DRONES-----");

        // DRON LIVIANO
        DronLiviano d1 = new DronLiviano();

        d1.setCodigo("LIV001");
        d1.setModelo("LivianoX");
        d1.setDistanciaKm(15);
        d1.setPesoPaquete(3);
        d1.setHorasVuelo(1.8);
        d1.costoBase = 5;
        d1.setLimiteHoras(2);

        // DRON CARGA
        DronCarga d2 = new DronCarga();

        d2.setCodigo("CAR001");
        d2.setModelo("CargaMax");
        d2.setDistanciaKm(45);
        d2.setPesoPaquete(20);
        d2.setHorasVuelo(3);
        d2.costoBase = 12;
        d2.setCostoPorKg(0.65);

        // DRON EMERGENCIA
        DronEmergencia d3 = new DronEmergencia();

        d3.setCodigo("EMG001");
        d3.setModelo("Emergente");
        d3.setDistanciaKm(8);
        d3.setPesoPaquete(3);
        d3.setHorasVuelo(1);
        d3.costoBase = 15;
        d3.setRecargoUrgencia(6);
        d3.setNivelPrioridad(2);

        // POLIMORFISMO
        Dron[] drones = {d1, d2, d3};

        for (Dron d : drones) {

            System.out.println("\n-----INFORMACIÓN DEL DRON-----");

            d.mostrarInformacion();

            System.out.println("Validación: " + d.validarDatos());

            System.out.println("Costo final: " + d.calcularCostoEntrega());
        }
    }
}