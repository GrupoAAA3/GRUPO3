package MisClases;

public class Direccion {
    private Integer id;
    private String provincia;
    private String ciudad;
    private String calle;
    private Integer numero;
    private Integer piso;
    private String mano;
    private Integer cp;

    public Direccion() {
    }

    //Para Trabajador
    public Direccion(Integer id, String calle, Integer numero, Integer piso, String mano) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.mano = mano;
    }

    //Para Centro
    public Direccion(Integer id, String provincia, String ciudad, String calle, Integer numero, Integer cp) {
        this.id = id;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }
    
    //Constructor general
    public Direccion(Integer id, String provincia, String ciudad, String calle, Integer numero, Integer piso, String mano, Integer cp) {
        this.id = id;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.mano = mano;
        this.cp = cp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }
    
    
}
