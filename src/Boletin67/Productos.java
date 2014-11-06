package Boletin67;

public class Productos {

    private String codigo;
    private float precio;

    public Productos() {
    }

    public Productos(String c, float p) {
        codigo = c;
        precio = p;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
}
