
package Entidades;


public class usuario {
   private int idUsuario;
   private String Usurio;
   private String Clave;
   private int estado;

    public usuario(int idUsuario, String Usurio, String Clave, int estado) {
        this.idUsuario = idUsuario;
        this.Usurio = Usurio;
        this.Clave = Clave;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsurio() {
        return Usurio;
    }

    public void setUsurio(String Usurio) {
        this.Usurio = Usurio;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "usuario{" + "idUsuario=" + idUsuario + ", Usurio=" + Usurio + ", Clave=" + Clave + ", estado=" + estado + '}';
    }
   
    public void validarUsuario(){
        
    }
}
