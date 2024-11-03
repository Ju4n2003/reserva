package co.edu.uniquindio.poo.model;

public class Ruta {
    private int peaje;
    private double distancia;
    private Zona zona ;

    public Ruta(int peaje,double distancia ) {
        this.peaje = peaje;
        this.distancia=distancia;

    }
    
    public int getPeaje() {
        return peaje;
    }
    
    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    

    


    
}
