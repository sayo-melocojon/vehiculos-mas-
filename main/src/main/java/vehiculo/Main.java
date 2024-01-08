/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vehiculo;

/**
 *
 * @author User sayo melocojon
 */
public class Main {

    public static void main(String[] args) {
        Automovil miAuto= new Automovil("Toyota", "Corolla", 2022, "Rojo",
                4, "Gasolina",5);
        System.out.println("Marca: "+miAuto.getMarca());
        System.out.println("Modelo: "+miAuto.getModelo());
        System.out.println("Año: "+miAuto.getAño());
        System.out.println("Color: "+miAuto.getColor());
        System.out.println("Numero de puertas: "+miAuto.getNumeroDePuertas());
        System.out.println("Tipo de combustible: "+miAuto.getTipodeCombustible());
        System.out.println("Capacidad de pasajeros: "+miAuto.getCapacidadDePasajeros());        
    }
}
