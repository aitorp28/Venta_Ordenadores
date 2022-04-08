package modelo;

public class Caja {
    private enum tipo{}
    private enum materiales{}
    private int cant_bahias;

    public Caja(int cant_bahias) {
        this.cant_bahias = cant_bahias;
    }
    public int getCant_bahias() {
        return cant_bahias;
    }

    public void setCant_bahias(int cant_bahias) {
        this.cant_bahias = cant_bahias;
    }
}
