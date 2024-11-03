package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Cliente {
    private String nombre ;
    private String cedula ;
    private String correo ;
    private String dirreccion;
    private LinkedList<Envio> envios;
    
    public Cliente(String nombre, String cedula, String correo, String dirreccion, LinkedList<Envio> envios) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.dirreccion = dirreccion;
        this.envios = envios;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDirreccion() {
        return dirreccion;
    }
    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }
    public LinkedList<Envio> getEnvios() {
        return envios;
    }
    public void setEnvios(LinkedList<Envio> envios) {
        this.envios = envios;
    }

    

    
}
