/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vototec;

/**
 *
 * @author J.F Ballestero
 */
public class Elecciones {
    private String tipo;
    private String periodo;
    private String duracionCampaña;
    public Elecciones(){  
    }
    public Elecciones(String tipo, String periodo, String duracionCampaña) {
        this.tipo = tipo;
        this.periodo = periodo;
        this.duracionCampaña = duracionCampaña;
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

    @Override
    public String toString() {
        return "Elecciones{" + "tipo=" + tipo + ", periodo=" + periodo + ", duracionCampa\u00f1a=" + duracionCampaña + '}';
    }
    
    
    
}
