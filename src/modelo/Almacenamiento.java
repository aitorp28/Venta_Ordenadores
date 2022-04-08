package modelo;

import java.io.Serializable;

public class Almacenamiento extends Componente implements Serializable {
    private int capacidad;
    private enum tipo{SSD,HDD,M2}
    public Almacenamiento(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,int capacidad) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
        setCapacidad(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
