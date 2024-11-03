package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Reserva {
    private LinkedList<Cliente> clientes ;
    private LinkedList<Vehiculo> Vehiculos;
    private Cliente cliente ;
    
    public Reserva(LinkedList<Cliente> clientes, LinkedList<Vehiculo> vehiculos, Cliente cliente) {
        this.clientes = clientes;
        Vehiculos = vehiculos;
        this.cliente = cliente;
    }
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        Vehiculos = vehiculos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
