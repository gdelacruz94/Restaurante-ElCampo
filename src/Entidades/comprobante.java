
package Entidades;


public class comprobante {
    private int idComprobanmte;
    private String tipoComprobante;

    public comprobante(int idComprobanmte, String tipoComprobante) {
        this.idComprobanmte = idComprobanmte;
        this.tipoComprobante = tipoComprobante;
    }

    public int getIdComprobanmte() {
        return idComprobanmte;
    }

    public void setIdComprobanmte(int idComprobanmte) {
        this.idComprobanmte = idComprobanmte;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    @Override
    public String toString() {
        return "comprobante{" + "idComprobanmte=" + idComprobanmte + ", tipoComprobante=" + tipoComprobante + '}';
    }
    
    
}
