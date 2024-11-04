package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private boolean esAutomatica;

    public Moto(String matricula, String marca, String modelo, int anioFabricacion, boolean esAutomatica) {
        super(matricula, marca, modelo, anioFabricacion);
        this.esAutomatica = esAutomatica;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    @Override
    public double calcularCostoReserva(int dias) {
        double tarifaBase = 30.0; // Ejemplo de tarifa base por día
        double tarifaAdicional = esAutomatica ? 10.0 : 0.0;
        return (tarifaBase + tarifaAdicional) * dias;
    }
}

