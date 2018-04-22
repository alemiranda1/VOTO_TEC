/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vototec;

import java.util.ArrayList;

/**
 *
 * @author J.F Ballestero
 */
public class Elecciones {
    private String tipo, periodo, duracionCampaña;
    ArrayList <Papeleta> papeleta = new ArrayList(); //ArrayList que almacena todas las papeletas
    private ArrayList<PartidoPolitico> partido = new ArrayList(); //ArrayList que almacena todos los partidos politicos
    
   //Constructor
    public Elecciones(String tipo, String periodo, String duracionCampaña) {
        this.tipo = tipo;
        this.periodo = periodo;
        this.duracionCampaña = duracionCampaña;
    }
    
    
    public void setPapeleta(Papeleta p) {
        papeleta.add(p);
    }

    public ArrayList<Papeleta> getPapeleta() {
        return this.papeleta;
    }
    
    public void imprimirPapeletas(){ //Método para recorrer el ArrayList e imprimirlo
        System.out.println("\n------Papeletas------\n");
        for(int i = 0; i < this.getPapeleta().size(); i++){
            System.out.println(this.getPapeleta().get(i).toString());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDuracionCampaña() {
        return duracionCampaña;
    }

    public void setDuracionCampaña(String duracionCampaña) {
        this.duracionCampaña = duracionCampaña;
    }

    public ArrayList<PartidoPolitico> getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico p) {
        this.partido.add(p);
    }
    

    @Override
    public String toString() {
        return "Elección{" + "tipo=" + tipo + ", periodo=" + periodo + ", duracionCampa\u00f1a=" + duracionCampaña + '}';
    }

}
