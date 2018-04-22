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
public class MiembroDeMesa extends Ciudadano {
    private String tipo;

    public MiembroDeMesa(String nombre, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalida, String fallecido, String empadronado, String estadoCivil, String domicilioJRV) {
        super(nombre, primerApellido, segundoApellido, cedula, fechaNacimiento, sexo, lugarNacimiento, nacionalida, fallecido, empadronado, estadoCivil, domicilioJRV);
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
