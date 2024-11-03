package co.edu.uniquindio.poo.model;

import java.util.List;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private Envio envio;

    public Camion(String placa, String modelo, String marca, double capacidadCarga) {
        super(placa, modelo, marca);
        this.capacidadCarga = capacidadCarga;
    }



    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Envio getEnvio() {
        return envio;
    }



    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
    

    @Override
    public double calcularCosto(Ruta ruta, List<Paquete> paquetes) {
        // Costo de los peajes
        double costoPeajes = ruta.getPeaje() * 12000;

        // Costo por peso de los paquetes
        double pesoTotalPaquetes = 0;
        for (Paquete paquete : paquetes) {
            pesoTotalPaquetes += paquete.getPeso();
        }
        double costoPorPeso = pesoTotalPaquetes * 7000;

        // Costo total
        return costoPeajes + costoPorPeso;
    }


    

}
