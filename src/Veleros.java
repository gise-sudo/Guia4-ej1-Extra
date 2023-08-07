public class Veleros extends Barco {

    private int mastiles;

    public Veleros(int mastiles, String matricula, double eslora, int fechaFabricacion) {
        super(matricula, eslora, fechaFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
 
  public void calcularPrecio(int precio){
      System.out.println("hola");
      System.out.println("Holaaaaa");
  } 
    
    
    
}
