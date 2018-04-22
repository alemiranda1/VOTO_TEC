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
public class CandidaturaD extends Ciudadano {
    private String provincia;
    private String tipo;
    private String posicion;

    public CandidaturaD(String provincia, String tipo, String posicion, String nombre, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalida, String fallecido, String empadronado, String estadoCivil, String domicilioJRV) {
        super(nombre, primerApellido, segundoApellido, cedula, fechaNacimiento, sexo, lugarNacimiento, nacionalida, fallecido, empadronado, estadoCivil, domicilioJRV);
        this.provincia = provincia;
        this.tipo = tipo;
        this.posicion = posicion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "CandidaturaD{" + "provincia=" + provincia + ", tipo=" + tipo + ", posicion=" + posicion + '}';
    }

    
    
    
    
    
}
