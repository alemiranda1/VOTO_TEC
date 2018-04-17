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
public class Cantón {
    private String codigo;
    private String nombre;
    private ArrayList<Distrito> distrito = new ArrayList();

    public Cantón(String codigo, String nombre) {
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

    public ArrayList<Distrito> getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito d) {
        this.distrito.add(d);
    }
    
    

    @Override
    public String toString() {
        return "Cantón{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
