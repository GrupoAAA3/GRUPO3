package MisClases;

public class Login {
    
//Aunque en el MER no lo pusimos por las prisas de las últimas horas, la habíamos pensado como débil de trabajador
    private String usuario;
    private String contrasena;
    
    private Trabajador dni;

    public Login(String usuario, String contrasena, Trabajador dni) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.dni = dni;
    }

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Trabajador getDni() {
        return dni;
    }

    public void setDni(Trabajador dni) {
        this.dni = dni;
    }
    
    
}
