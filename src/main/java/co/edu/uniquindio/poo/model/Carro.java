package co.edu.uniquindio.poo.model;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String matricula, String marca, String modelo, int anioFabricacion, int numeroPuertas) {
        super(matricula, marca, modelo, anioFabricacion);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoReserva(int dias) {
        double tarifaBase = 50.0; // Ejemplo de tarifa base por día
        return tarifaBase * dias;
    }
}