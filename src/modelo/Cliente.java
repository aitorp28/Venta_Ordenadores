package modelo;

public class Cliente {
    private String documentacion;
    private String nombre;
    private String Apellido;
    private int tlf;
    private String correo;
    private String direccion;

    public Cliente(String documentacion, String nombre, String apellido, int tlf, String correo, String direccion) {
        setDocumentacion(documentacion);
        setNombre(nombre);
        setApellido(apellido);
        setTlf(tlf);
        setCorreo(correo);
        setDireccion(direccion);
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
