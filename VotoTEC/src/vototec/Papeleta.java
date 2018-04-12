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
public class Papeleta {
    private String identificador;
    private String tipo;
    private BufferedImage diseñoPapeleta;

    //Constructor
    public Papeleta(String identificador, String tipo, BufferedImage diseñoPapeleta) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.diseñoPapeleta = diseñoPapeleta;
    }

    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BufferedImage getDiseñoPapeleta() {
        return diseñoPapeleta;
    }

    public void setDiseñoPapeleta(BufferedImage diseñoPapeleta) {
        this.diseñoPapeleta = diseñoPapeleta;
    }
    
    

    @Override
    public String toString() {
        return "Papeleta{" + "identificador=" + identificador + ", tipo=" + tipo + '}';
    }
    
    
}
