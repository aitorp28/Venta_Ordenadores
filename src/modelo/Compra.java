package modelo;

import java.io.Serializable;
import java.util.Date;

public class Compra implements Serializable {
    private String n_referencia;
    private Ordenador pc;
    private String dni;
    private String fecha;
    private double precio;

    public Compra(String n_referencia, Ordenador pc, String dni, String fecha, double precio) {
        setN_referencia(n_referencia);
        setPc(pc);
        setDni(dni);
        setFecha(fecha);
        setPrecio(precio);
    }

    public String getN_referencia() {
        return n_referencia;
    }

    public void setN_referencia(String n_referencia) {
        this.n_referencia = n_referencia;
    }

    public Ordenador getPc() {
        return pc;
    }

    public void setPc(Ordenador pc) {
        this.pc = pc;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
