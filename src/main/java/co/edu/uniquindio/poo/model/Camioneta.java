package co.edu.uniquindio.poo.model;


public class Camioneta extends Vehiculo {
    private double capacidadToneladas;

    public Camioneta(String matricula, String marca, String modelo, int anioFabricacion, double capacidadToneladas) {
        super(matricula, marca, modelo, anioFabricacion);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoReserva(int dias) {
        double tarifaBase = 70.0; // Ejemplo de tarifa base por día
        double tarifaAdicional = 15.0 * capacidadToneladas;
        return (tarifaBase + tarifaAdicional) * dias;
    }
}
