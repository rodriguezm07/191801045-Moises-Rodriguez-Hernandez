
public class Usuario {

    private String nombreUsuario,contraseña,fechaAlta;
    private int id,status; 

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseña, String fechaAlta, int id, int status) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaAlta = fechaAlta;
        this.id = id;
        this.status = status;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fechaAlta=" + fechaAlta + ", id=" + id + ", status=" + status + '}';
    }
    
    
    
}
