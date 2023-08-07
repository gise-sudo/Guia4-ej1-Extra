
import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Guia4ej1extra {
    
     public static void main(String[] args){
         
         Barco uno = new Veleros(2,"asd123", 20, 2020);
         Alquiler alquiler = new Alquiler("Pablo", 395864932, LocalDate.of(2023, Month.MARCH, 10), LocalDate.of(2023, Month.MARCH, 20), 4, uno);
         alquiler.calcularPrecio();
     }
}
