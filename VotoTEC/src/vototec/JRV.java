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
public class JRV {
    private String codigo;
    private int candtidadElectores;
    private String direccion;
    private String locacion;
    /*Listas de arreglo en las que se contienen las relaciones
    */
    private ArrayList<MiembroDeMesa> miembro = new ArrayList();
    private ArrayList<Distrito> distrito = new ArrayList();
    private ArrayList<Localidad> localidad = new ArrayList();

    public JRV(String codigo, int candtidadElectores, String direccion, String locacion) {
        this.codigo = codigo;
        this.candtidadElectores = candtidadElectores;
        this.direccion = direccion;
        this.locacion = locacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCandtidadElectores() {
        return candtidadElectores;
    }

    public void setCandtidadElectores(int candtidadElectores) {
        this.candtidadElectores = candtidadElectores;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public ArrayList<MiembroDeMesa> getMiembro() {
        return miembro;
    }

    public void setMiembro(MiembroDeMesa m) {
        this.miembro.add(m);
    }

    public ArrayList<Distrito> getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito d) {
        this.distrito.add(d);
    }

    public ArrayList<Localidad> getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad l) {
        this.localidad.add(l);
    }

    
    
    @Override
    public String toString() {
        return "JRV{" + "codigo=" + codigo + ", candtidadElectores=" + candtidadElectores + ", direccion=" + direccion + ", locacion=" + locacion + ", miembro=" + miembro + '}';
    }
    
    

}
