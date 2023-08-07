
public abstract class Barco {

    protected String matricula;

    protected double eslora;

    protected int fechaFabricacion;

    public Barco(String matricula, double eslora, int fechaFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    
    
    
}
