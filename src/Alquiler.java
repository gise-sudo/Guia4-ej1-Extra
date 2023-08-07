
import java.time.LocalDate;

public class Alquiler {

    private String nombre;

    private int dni;

    private LocalDate fechaAlquiler;

    private LocalDate fechaDevolucion;

    private int posicionAmarre;

    private Barco barco;
    
    
    

    public Alquiler(String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public  void calcularPrecio(){
        int rta = fechaDevolucion.getDayOfYear() - fechaAlquiler.getDayOfYear();
        double precio = rta * barco.getEslora() * 10;
        System.out.println("El precio de alquiler es: $ "+precio);
       
    }
    
}
