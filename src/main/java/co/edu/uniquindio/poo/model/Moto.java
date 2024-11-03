package co.edu.uniquindio.poo.model;

import java.util.List;

public class Moto extends Vehiculo  {
    private String cilindrada ;

    public Moto(String placa, String modelo, String marca, String cilindrada) {
        super(placa, modelo, marca);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCosto(Ruta ruta, Envio envio, List<Paquete> paquetes) {
        double costoPorPaquete;

        // Determina el costo fijo en función de la zona
        if (envio.getZona() == Zona.RURAL) {
            costoPorPaquete = 15000;
        } else { // Zona URBANA
            costoPorPaquete = 8000;
        }

        // Calcula el costo total multiplicando el costo por paquete por el número de paquetes
        return costoPorPaquete * paquetes.size();
    }

    

    
}
