package vehiculo;

/**
 *
 * @author User sayo melocojon
 */
  
public class Automovil extends Vehiculo{
    private int numeroDePuertas;
    private String tipodeCombustible;
    private int capacidadDePasajeros;

    public Automovil (String marca, String modelo, int año, String color, int numeroDePuertas, 
            String tipodeCombustible, int capacidadDePasajeros ) {
        
        super(marca, modelo,año,color);
        this.numeroDePuertas=numeroDePuertas;
        this. tipodeCombustible=tipodeCombustible;
        this.capacidadDePasajeros=capacidadDePasajeros;
    }
    public int getNumeroDePuertas(){
        return numeroDePuertas;
    }
    
    public void setNumeroDePuertas(int numeroDePuertas){
        this.numeroDePuertas=numeroDePuertas;
    }

    
    
    public String getTipodeCombustible(){
        return tipodeCombustible;
    }
    
    public void setTipodeCombustible(String tipodeCombustible){
        this.tipodeCombustible=tipodeCombustible;
    }
    
    
    
    public int getCapacidadDePasajeros(){
        return capacidadDePasajeros;
    }
    
    public void setCapacidadDePasajeros(int capacidadDePasajeros){
        this.capacidadDePasajeros=capacidadDePasajeros;
    }
}
