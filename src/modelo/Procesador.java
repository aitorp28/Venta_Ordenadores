package modelo;

import java.io.Serializable;

public class Procesador extends Componente implements Serializable {
    private int nucleos;
    private int cant_filamentos;
    private int frecuencia_GHz;

    public Procesador(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,int nucleos,int cant_filamentos,int frecuencia_GHz) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
        setCant_filamentos(cant_filamentos);
        setNucleos(nucleos);
        setFrecuencia_GHz(frecuencia_GHz);
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getCant_filamentos() {
        return cant_filamentos;
    }

    public void setCant_filamentos(int cant_filamentos) {
        this.cant_filamentos = cant_filamentos;
    }

    public int getFrecuencia_GHz() {
        return frecuencia_GHz;
    }

    public void setFrecuencia_GHz(int frecuencia_GHz) {
        this.frecuencia_GHz = frecuencia_GHz;
    }
}
