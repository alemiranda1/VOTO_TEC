/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vototec;

import java.awt.image.BufferedImage;

/**
 *
 * @author J.F Ballestero
 */


//https://beginnersbook.com/2014/07/java-finding-minimum-and-maximum-values-in-an-array/

public class VotoTEC {

    /**
     * @param args the command line arguments
     */
    
     
    
    public static void main(String[] args) {
       
       BufferedImage PapeletaP = Loader.ImageLoader("/Papeletas/PapeletaP.jpeg"); //Carga la imagen da la papeleta presidencial
       BufferedImage PapeletaD = Loader.ImageLoader("/Papeletas/PapeletaD.jpeg"); //Carga la imagen de la papeleta diputados
        
        TSE t = new TSE(); //Instanciación de objeto 'TSE'
        
        Elecciones eleccion2018 = new Elecciones("Directo", "2018 - 2022", "6 meses"); //Instanciación de objeto 'Elecciones'
                
        t.setElecciones(eleccion2018); //Agrega el objeto Elecciones al ArrayList
        t.imprimirElecciones(); //Imprime el ArrayList
        
        
        Papeleta p1 = new Papeleta("2321", "Presidencial", PapeletaP);
        Papeleta p2 = new Papeleta("2321", "Diputados", PapeletaD);
        
        eleccion2018.setPapeleta(p1);
        eleccion2018.imprimirPapeletas();
        
       
    }
    
}
