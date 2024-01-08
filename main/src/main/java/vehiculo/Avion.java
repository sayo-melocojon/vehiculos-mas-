/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author User sayo melocojon
 */
public class Avion extends Vehiculo{
    private int capacidadDePasajeros;
    private String tipoMotor;
    
    public Avion (String marca, String modelo, int año, String color,int capacidadDePasajeros, String tipoMotor){
        super (marca,modelo,año,color);
        this.capacidadDePasajeros=capacidadDePasajeros;
        this.tipoMotor=tipoMotor;
    }
    
    public int capacidadDePasajeros(){
        return capacidadDePasajeros;
    }
    
    public void capacidadDePasajeros(int capacidadDePasajeros){
        this.capacidadDePasajeros=capacidadDePasajeros;
    }
    
    public String tipoMotor(){
        return tipoMotor;
    }
            
    public void tipoMotor(String tipoMotor){
        this.tipoMotor=tipoMotor;
    }
    
    public void mostrarDetalles(){
        System.out.println("Avion-Marca: "+getMarca()+", Modelo: "+getModelo()+", Año: "+getAño()+", Color: "+ getColor()+", Capacidad de pasajeros: "+ capacidadDePasajeros+ ", TIpo de motor: "+tipoMotor);
    }
}
