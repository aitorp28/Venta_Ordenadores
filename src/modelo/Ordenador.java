package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Ordenador implements Serializable {
    private ArrayList<Componente> ARLC;
    private double precio;

    public Ordenador(ArrayList<Componente> ARLC, double precio) {
        setARLC(ARLC);
        setPrecio(precio);
    }

    public ArrayList<Componente> getARLC() {
        return ARLC;
    }

    public void setARLC(ArrayList<Componente> ARLC) {
        this.ARLC = ARLC;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
