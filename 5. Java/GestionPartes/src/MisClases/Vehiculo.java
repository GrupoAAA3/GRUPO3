package MisClases;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private Integer peso;

    public Vehiculo(String matricula, String modelo, String marca, Integer peso) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
    }

    public Vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    
    
}
