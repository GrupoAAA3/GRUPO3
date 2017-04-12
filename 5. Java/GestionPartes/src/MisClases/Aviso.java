package MisClases;

public class Aviso {
    private Integer idAviso;
    private String descripcion;
    
    private Trabajador dni;

    public Aviso(Integer idAviso, String descripcion, Trabajador dni) {
        this.idAviso = idAviso;
        this.descripcion = descripcion;
        this.dni = dni;
    }

    public Aviso() {
    }

    public Integer getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(Integer idAviso) {
        this.idAviso = idAviso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Trabajador getDni() {
        return dni;
    }

    public void setDni(Trabajador dni) {
        this.dni = dni;
    }
    
    
}
