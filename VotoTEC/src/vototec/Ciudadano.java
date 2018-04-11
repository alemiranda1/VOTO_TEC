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
public class Ciudadano {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String fechaNacimiento;
    private String sexo;
    private String lugarNacimiento;
    private String nacionalida;
    private String fallecido;
    private String empadronado;
    private String estadoCivil;
    private String domicilioJRV;

    public Ciudadano(String nombre, String primerApellido, String segundoApellido, String cedula, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalida, String fallecido, String empadronado, String estadoCivil, String domicilioJRV) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.lugarNacimiento = lugarNacimiento;
        this.nacionalida = nacionalida;
        this.fallecido = fallecido;
        this.empadronado = empadronado;
        this.estadoCivil = estadoCivil;
        this.domicilioJRV = domicilioJRV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public String getFallecido() {
        return fallecido;
    }

    public void setFallecido(String fallecido) {
        this.fallecido = fallecido;
    }

    public String getEmpadronado() {
        return empadronado;
    }

    public void setEmpadronado(String empadronado) {
        this.empadronado = empadronado;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDomicilioJRV() {
        return domicilioJRV;
    }

    public void setDomicilioJRV(String domicilioJRV) {
        this.domicilioJRV = domicilioJRV;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", lugarNacimiento=" + lugarNacimiento + ", nacionalida=" + nacionalida + ", fallecido=" + fallecido + ", empadronado=" + empadronado + ", estadoCivil=" + estadoCivil + ", domicilioJRV=" + domicilioJRV + '}';
    }
    
    
    
    
}
