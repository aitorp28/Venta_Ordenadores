package modelo;

import java.io.Serializable;

public class Fuente_De_Alimentacion extends Componente implements Serializable {
    private int potencia;
    private enum tipo{White,Bronze,Gold,Platinum,Silver,Standart,Titanium}
    private int ventilador;
    private int ruido;
    public Fuente_De_Alimentacion(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo,int potencia,int ventilador,int ruido) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
        setPotencia(potencia);
        setVentilador(ventilador);
        setRuido(ruido);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVentilador() {
        return ventilador;
    }

    public void setVentilador(int ventilador) {
        this.ventilador = ventilador;
    }

    public int getRuido() {
        return ruido;
    }

    public void setRuido(int ruido) {
        this.ruido = ruido;
    }
}
