package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Envio {
    private String codigo ;
    private double totalCosto;
    private LinkedList<Paquete> paquetes ;
    private Ruta ruta ;
    private Zona zona;
    public Envio(String codigo, double totalCosto, LinkedList<Paquete> paquetes, Ruta ruta) {
        this.codigo = codigo;
        this.totalCosto = totalCosto;
        this.paquetes = paquetes;
        this.ruta = ruta;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getTotalCosto() {
        return totalCosto;
    }
    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }
    public LinkedList<Paquete> getPaquetes() {
        return paquetes;
    }
    public void setPaquetes(LinkedList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }

    

    




    
}
