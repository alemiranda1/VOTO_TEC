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
public class Localidad {
    private String codigo;
    private String nombre;
    private ArrayList<Consulado> consulado = new ArrayList();

    public Localidad(String codigo, String nombre) {
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

    public ArrayList<Consulado> getConsulado() {
        return consulado;
    }

    public void setConsulado(ArrayList<Consulado> consulado) {
        this.consulado = consulado;
    }
    
    

    @Override
    public String toString() {
        return "Localidad{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
