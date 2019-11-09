package Entidades;


public class factura extends comprobante{
    private String numeroRun;
    private String razonSocial;

    public factura(String numeroRun, String razonSocial, int idComprobanmte, String tipoComprobante) {
        super(idComprobanmte, tipoComprobante);
        this.numeroRun = numeroRun;
        this.razonSocial = razonSocial;
    }

    public String getNumeroRun() {
        return numeroRun;
    }

    public void setNumeroRun(String numeroRun) {
        this.numeroRun = numeroRun;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "factura{" + "numeroRun=" + numeroRun + ", razonSocial=" + razonSocial + '}';
    }
    
    
}
