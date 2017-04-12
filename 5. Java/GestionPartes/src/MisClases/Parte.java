package MisClases;

public class Parte {
    private Integer albaran;
    private Integer kmIni;
    private Integer kmFin;
    private Integer gastoGasoil;
    private Integer gastoPeaje;
    private Integer gastoDietas;
    private Integer gastoOtros;
    private String incidencias;
    private boolean validacion;
    
    private Vehiculo matricula;
    private Trabajador dni;

    public Parte(Integer albaran, Integer kmIni, Integer kmFin, Integer gastoGasoil, Integer gastoPeaje, Integer gastoDietas, Integer gastoOtros, 
   String incidencias, boolean validacion, Vehiculo matricula, Trabajador dni) {
        this.albaran = albaran;
        this.kmIni = kmIni;
        this.kmFin = kmFin;
        this.gastoGasoil = gastoGasoil;
        this.gastoPeaje = gastoPeaje;
        this.gastoDietas = gastoDietas;
        this.gastoOtros = gastoOtros;
        this.incidencias = incidencias;
        this.validacion = validacion;
        this.matricula = matricula;
        this.dni = dni;
    }

    public Parte() {
    }

    public Vehiculo getMatricula() {
        return matricula;
    }

    public void setMatricula(Vehiculo matricula) {
        this.matricula = matricula;
    }

    public Trabajador getDni() {
        return dni;
    }

    public void setDni(Trabajador dni) {
        this.dni = dni;
    }
     
    public Integer getAlbaran() {
        return albaran;
    }

    public void setAlbaran(Integer albaran) {
        this.albaran = albaran;
    }

    public Integer getKmIni() {
        return kmIni;
    }

    public void setKmIni(Integer kmIni) {
        this.kmIni = kmIni;
    }

    public Integer getKmFin() {
        return kmFin;
    }

    public void setKmFin(Integer kmFin) {
        this.kmFin = kmFin;
    }

    public Integer getGastoGasoil() {
        return gastoGasoil;
    }

    public void setGastoGasoil(Integer gastoGasoil) {
        this.gastoGasoil = gastoGasoil;
    }

    public Integer getGastoPeaje() {
        return gastoPeaje;
    }

    public void setGastoPeaje(Integer gastoPeaje) {
        this.gastoPeaje = gastoPeaje;
    }

    public Integer getGastoDietas() {
        return gastoDietas;
    }

    public void setGastoDietas(Integer gastoDietas) {
        this.gastoDietas = gastoDietas;
    }

    public Integer getGastoOtros() {
        return gastoOtros;
    }

    public void setGastoOtros(Integer gastoOtros) {
        this.gastoOtros = gastoOtros;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }
    
    
}
