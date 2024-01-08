/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author User sayo melocojon
 */
public class Camion extends Vehiculo{
    private int capacidadDeCarga;
    
    public Camion(String marca, String modelo,String año, String color, String capacidadDeCarga){
        super (marca,modelo,año,color);
        this.capacidadDeCarga=capacidadDeCarga;
    }
    
    public int getCapacidadDeCarga(){
        return capacidadDeCarga;
    }
    
    public void setCapacidadDeCarga(int capacidadDeCarga){
        this.capacidadDeCarga=capacidadDeCarga;
    }
    
    public void mostrarDetalles(){
        System.out.println("Camion-Marca: "+getMarca()+", Modelo: "+getModelo()+", Año: "+getAño()+", Color: "+ getColor()+", Carga maxima: "+ capacidadDeCarga+" kg ");
    }
}
