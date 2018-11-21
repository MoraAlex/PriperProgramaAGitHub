/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

public class ServiciosCompu implements ICRUD{
    
    
    ArrayList<Computadora> listaDeCompus = new ArrayList();
    
    @Override
    public boolean create(Computadora compu){
        return listaDeCompus.add(compu);
    }

    @Override
    public ArrayList read() {
        return listaDeCompus;
    }

    @Override
    public boolean update(Computadora compuUpdate, String numeroDeSerie) {
        int index;
        for(Computadora a : listaDeCompus)
        {
            if(a.getNoDeSerie() == numeroDeSerie)
            {
                index = listaDeCompus.indexOf(a); 
                listaDeCompus.remove(a);
                listaDeCompus.set(index, a);
                return true;
            }
        } 
            
        return false;
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
