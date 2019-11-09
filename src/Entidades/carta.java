
package Entidades;


public class carta {
    private int idCarta;
    private String nombre;
    private int idCategoria;
    private double decimal;
    private int estado;

    public carta(int idCarta, String nombre, int idCategoria, double decimal, int estado) {
        this.idCarta = idCarta;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.decimal = decimal;
        this.estado = estado;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "carta{" + "idCarta=" + idCarta + ", nombre=" + nombre + ", idCategoria=" + idCategoria + ", decimal=" + decimal + ", estado=" + estado + '}';
    }
    
    
}
