package co.edu.uniquindio.poo.model;

import java.util.List;

public class Furgoneta extends Vehiculo{
    private TipoCambio tipoCambio;
    private Envio envio ;

    

    public Furgoneta(String placa, String modelo, String marca, TipoCambio tipoCambio) {
        super(placa, modelo, marca);
        this.tipoCambio = tipoCambio;
    }

    public TipoCambio getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(TipoCambio tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
    @Override
    public double calcularCosto(Ruta ruta, Envio envio, List<Paquete> paquetes) {
        // Datos quemados
        double costoCombustiblePorKm = 3000; // 3000 pesos por km
        double fleteFijo = 10000; // Flete fijo de 10,000 pesos

        // Costo total usando los datos quemados
        double costoCombustible = ruta.getDistancia() * costoCombustiblePorKm;

        // Costo total (costo de combustible + flete fijo)
        return costoCombustible + fleteFijo;
    }


    
    
}
