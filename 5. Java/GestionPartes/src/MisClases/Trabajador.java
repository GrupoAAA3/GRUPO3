package MisClases;

public class Trabajador {
    private String dni;
    private String nombre;
    private String apeuno;
    private String apedos;
    private Direccion direccion;
    private String telefonoPersonal;
    private String telefonoEmpresa;
    private Double salario;
    private String fechaNac;
    private String tipo;
    private Centro codigo;

    public Trabajador(String dni, String nombre, String apeuno, String apedos, Direccion direccion, String telefonoPersonal, String telefonoEmpresa, Double salario, String fechaNac, String tipo, Centro codigo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apeuno = apeuno;
        this.apedos = apedos;
        this.direccion = direccion;
        this.telefonoPersonal = telefonoPersonal;
        this.telefonoEmpresa = telefonoEmpresa;
        this.salario = salario;
        this.fechaNac = fechaNac;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    

    public Trabajador() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public void setTelefonoPersonal(String telefonoPersonal) {
        this.telefonoPersonal = telefonoPersonal;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Centro getCodigo() {
        return codigo;
    }

    public void setCodigo(Centro codigo) {
        this.codigo = codigo;
    }

    public String getApeuno() {
        return apeuno;
    }

    public void setApeuno(String apeuno) {
        this.apeuno = apeuno;
    }

    public String getApedos() {
        return apedos;
    }

    public void setApedos(String apedos) {
        this.apedos = apedos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
