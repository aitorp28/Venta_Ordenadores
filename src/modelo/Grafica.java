package modelo;

import java.io.Serializable;

public class Grafica extends Componente implements Serializable {
    private int memoria_grafica;
    private int frecuencia_procesador;
    public Grafica(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,int memoria_grafica,int frecuencia_procesador) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
        setMemoria_grafica(memoria_grafica);
        setFrecuencia_procesador(frecuencia_procesador);
    }

    public int getMemoria_grafica() {
        return memoria_grafica;
    }

    public void setMemoria_grafica(int memoria_grafica) {
        this.memoria_grafica = memoria_grafica;
    }

    public int getFrecuencia_procesador() {
        return frecuencia_procesador;
    }

    public void setFrecuencia_procesador(int frecuencia_procesador) {
        this.frecuencia_procesador = frecuencia_procesador;
    }
}
