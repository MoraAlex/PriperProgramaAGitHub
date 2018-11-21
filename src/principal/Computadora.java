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
public class Computadora extends Tecnologia {
    String procesador;
    int RAM;
    
    public Computadora(){
        
    }
    public Computadora(String noDeSerie, String anio, String modelo, String procesador, int RAM){
        super(noDeSerie, anio, modelo);
        this.procesador = procesador;
        this.RAM = RAM;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEl procesador es " + this.procesador + "\nLa RAM es " + this.RAM;
    }
    
    @Override
    public void setNoDeSerie(String noDeSerie){
        super.setNoDeSerie(noDeSerie);
    }
    @Override
    public String getNoDeSerie(){
        return super.getNoDeSerie();
    }
    
    @Override
    public void setAnio(String anio){
        super.setAnio(anio);
    }
    @Override
    public String getAnio(){
        return super.getAnio();
    }
    
    @Override
    public void setModelo(String modelo){
        super.setModelo(modelo);
    } 
    @Override
    public String getModelo(){
        return super.getModelo();
    }
    
}
