/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vototec;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class TSE {
    
    ArrayList <Elecciones> elecciones = new ArrayList(); //ArrayList que almacena todas las elecciones


    
    public void setElecciones(Elecciones e) {
        elecciones.add(e);
    }

    public ArrayList<Elecciones> getElecciones() {
        return this.elecciones;
    }
    
    public void imprimirElecciones(){ //Método para recorrer el ArrayList e imprimirlo
        System.out.println("\n------Elecciones " + "de Costa Rica------\n");
        for(int i = 0; i < this.getElecciones().size(); i++){
            System.out.println(this.getElecciones().get(i).toString());
        }
    }
    


    
    
    
    
    
}
