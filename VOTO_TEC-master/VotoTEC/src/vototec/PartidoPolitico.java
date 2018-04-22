/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vototec;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author J.F Ballestero
 */
public class PartidoPolitico {
    
    private String nombre, codigo, escala, fecha, telefono, direccion;
    private BufferedImage bandera;
    private ArrayList<Elecciones> eleccion = new ArrayList();

    //Constructor
    public PartidoPolitico(String nombre, String codigo, String escala, String fecha, String telefono, String direccion, BufferedImage bandera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escala = escala;
        this.fecha = fecha;
        this.telefono = telefono;
        this.direccion = direccion;
        this.bandera = bandera;
    }

    /*Getters and Setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BufferedImage getBandera() {
        return bandera;
    }

    public void setBandera(BufferedImage bandera) {
        this.bandera = bandera;
    }

    public ArrayList<Elecciones> getEleccion() {
        return eleccion;
    }

    public void setEleccion(Elecciones e) {
        this.eleccion.add(e);
    }
    
    

    @Override
    public String toString() {
        return "PartidoPolitico{" + "nombre=" + nombre + ", codigo=" + codigo + ", escala=" + escala + ", fecha=" + fecha + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
    public String imprimirEleccion(){
        String resultado = "";
        
        for(int i = 0; i < this.getEleccion().size();i++)
            resultado += this.getEleccion().get(i).toString() + "\n";
        
        return resultado;
    }
    
    
    
    
}
