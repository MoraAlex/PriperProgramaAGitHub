/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

public interface ICRUD {
    public boolean create(Computadora compu);
    public ArrayList read();
    public boolean update(Computadora compuUpdate, String numeroDeSerie);
    public void delete();
}
