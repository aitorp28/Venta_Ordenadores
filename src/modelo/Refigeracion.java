package modelo;

import java.io.Serializable;

public class Refigeracion extends Componente implements Serializable {
    private enum tipo{liquida,aire};
    public Refigeracion(double precio, String nombre, String id, double peso, double altura, double anchura, String marca, String modelo) {
        super(precio, nombre, id, peso, altura, anchura, marca, modelo);
    }
}
