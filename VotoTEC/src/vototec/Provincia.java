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
public class Provincia {
    private String codigo;
    private String nombre;
    private ArrayList<Cantón> cantón = new ArrayList();

    public Provincia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cantón> getCantón() {
        return cantón;
    }

    public void setCantón(Cantón c) {
        this.cantón.add(c);
    }
    
    

    @Override
    public String toString() {
        return "Provincia{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
