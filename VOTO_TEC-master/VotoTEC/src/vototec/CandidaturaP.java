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
public class CandidaturaP extends Ciudadano {
    private String partidoPolitico;
    private String tipo;
    private String numeroCedula;

    public CandidaturaP(String partidoPolitico, String tipo, String numeroCedula, String nombre, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalida, String fallecido, String empadronado, String estadoCivil, String domicilioJRV) {
        super(nombre, primerApellido, segundoApellido, cedula, fechaNacimiento, sexo, lugarNacimiento, nacionalida, fallecido, empadronado, estadoCivil, domicilioJRV);
        this.partidoPolitico = partidoPolitico;
        this.tipo = tipo;
        this.numeroCedula = numeroCedula;
    }


    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    @Override
    public String toString() {
        return "CandidaturaP{" + "partidoPolitico=" + partidoPolitico + ", tipo=" + tipo + ", numeroCedula=" + numeroCedula + '}';
    }
    
    
}
