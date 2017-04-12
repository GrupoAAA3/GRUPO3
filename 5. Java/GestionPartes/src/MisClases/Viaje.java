package MisClases;

import java.sql.Date;

public class Viaje {
    private Integer idViaje;
    private Date horaIni;
    private Date horaFin;
    
    private Parte albaran;
    
    public Viaje(Integer idViaje, Date horaIni, Date horaFin, Parte albaran) {
        this.idViaje = idViaje;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.albaran = albaran;
    }

    public Viaje() {
    }

    public Parte getAlbaran() {
        return albaran;
    }

    public void setAlbaran(Parte albaran) {
        this.albaran = albaran;
    }

    public Integer getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Integer idViaje) {
        this.idViaje = idViaje;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
