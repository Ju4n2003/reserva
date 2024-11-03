package co.edu.uniquindio.poo.model;

import java.util.List;

public abstract class Vehiculo {
    public String placa;
    public String modelo;
    public String marca ;

    public Vehiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double calcularCosto( Ruta ruta, List<Paquete> paquetes); 
}

    

