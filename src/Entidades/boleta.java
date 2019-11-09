package Entidades;


public class boleta extends comprobante{
    private int dniCliente;
    private String nombreCliente;

    public boleta(int dniCliente, String nombreCliente, int idComprobanmte, String tipoComprobante) {
        super(idComprobanmte, tipoComprobante);
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
}
