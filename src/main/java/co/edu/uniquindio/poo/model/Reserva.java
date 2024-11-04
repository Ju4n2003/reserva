package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaInicio;
    private int dias;
    private double costo;

    public Reserva(LocalDate fechaInicio, int dias, double costo) {
        this.fechaInicio = fechaInicio;
        this.dias = dias;
        this.costo = costo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
