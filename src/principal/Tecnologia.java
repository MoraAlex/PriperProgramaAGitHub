/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author alexx
 */
public abstract class Tecnologia {
    private String noDeSerie;
    private String anio;
    private String modelo;
    
    public Tecnologia(){
        
    }
    public Tecnologia(String noDeSerie, String anio, String modelo){
        this.noDeSerie = noDeSerie;
        this.anio = anio;
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "El modelo es " + this.modelo + "\nEl año es " + this.anio + "\nEl No de serie es " + this.noDeSerie;
    }
    
    public void setNoDeSerie(String noDeSerie){
        this.noDeSerie = noDeSerie;
    }
    public String getNoDeSerie(){
        return noDeSerie;
    }
    
    public void setAnio(String anio){
        this.anio = anio;
    }
    public String getAnio(){
        return anio;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
            
}
