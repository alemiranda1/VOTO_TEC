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
public class MiembroDeMesa {
    private String tipo;

    public MiembroDeMesa(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "MiembroDeMesa{" + "tipo=" + tipo + '}';
    }
    
    
}
