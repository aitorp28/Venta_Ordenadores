package modelo;

import java.io.Serializable;

public abstract class Componente implements Serializable {
    private double precio;
    private String nombre;
    private String id;
    private double peso;
    private double altura;
    private double anchura;
    private String marca;
    private String modelo;

    public Componente(double precio,String nombre,String id,double peso,double altura,double anchura,String marca,String modelo){
        setAltura(altura);
        setId(id);
        setMarca(marca);
        setModelo(modelo);
        setNombre(nombre);
        setPrecio(precio);
        setPeso(peso);
        setAnchura(anchura);
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
