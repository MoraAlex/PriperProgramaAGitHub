/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alexx
 */
public class Principal {
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanLine = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private static void menu(){
        
        ServiciosCompu servicios = new ServiciosCompu();
        boolean bandera = true;
        System.out.println(" Programa chido");
        do
        {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1.-Añadir computadora");
            System.out.println("2.-Revisar lista");
            System.out.println("3.-Modificar en la lista");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Exit");
            int opcion = scanInt.nextInt();
            switch(opcion)
            {
                case 1: 
                    Computadora compuCrear = pedirDatosAUsuario();
                    if(servicios.create(compuCrear))
                        System.out.println("Computadora creada con exito");
                    else
                        System.out.println("No se pudo crear la computadora");
                    break;
                case 2:
                    ArrayList listaDeCompus = servicios.read();
                    imprimir(listaDeCompus);
                    break;
                case 3: 
                    System.out.println("Ingrese los nuevos datos");
                    Computadora compuUpdate = pedirDatosAUsuario();
                    if(servicios.update(compuUpdate, obtenerNumeroDeSerie()))
                        System.out.println("Se actualizo con exito");
                    else
                        System.out.println("Fallo la actualizacion");
                    break;
                case 4:
                    servicios.delete();
                    break;
                case 5: bandera = !bandera;
                    break;
                default: System.out.println("Opcion no valida");
                break;
            }
            
        }while(bandera);
    }

    private static Computadora pedirDatosAUsuario() {
        
        System.out.println("Ingrese el No. de serie");
        String noSerie = scanLine.nextLine();
        System.out.println("Ingrese el año de la computadora");
        String anio = scanLine.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = scanLine.nextLine();
        System.out.println("Ingrese el procesador");
        String procesador = scanLine.nextLine();
        System.out.println("Ingrese la RAM");
        int ram = scanInt.nextInt();
        
        Computadora compu = new Computadora(noSerie, anio, modelo, procesador, ram);
        return compu;
    }

    private static void imprimir(ArrayList<Computadora> listaDeCompus) {
        for(Computadora compu : listaDeCompus)
            System.out.println(compu);
    }
    
    private static String obtenerNumeroDeSerie()
    {
        System.out.println("Ingrese el numero de serie de la compu a modificar");
        String numeroDeSerie = scanLine.nextLine();
        return numeroDeSerie;
    }

}
