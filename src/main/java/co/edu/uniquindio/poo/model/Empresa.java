package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Vehiculo> vehiculos;
    private List<Reserva> reservas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }
}
