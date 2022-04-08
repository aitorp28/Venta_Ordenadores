package modelo;

import java.io.Serializable;

public class Placa_Base extends Componente implements Serializable {
    private String socket;
    private enum memoria_compatible{DDR1,DDR2,DDR3,DDR4,DDR5}
    private int ranuras_memoria;

    private enum almacenamiento_soportado{HDD,SSD,M2}
    public Placa_Base(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,String socket,int ranuras_memoria) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
        setSocket(socket);
        setRanuras_memoria(ranuras_memoria);
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getRanuras_memoria() {
        return ranuras_memoria;
    }

    public void setRanuras_memoria(int ranuras_memoria) {
        this.ranuras_memoria = ranuras_memoria;
    }
}
