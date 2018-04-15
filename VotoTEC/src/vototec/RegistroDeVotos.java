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
public class RegistroDeVotos {
    private String registroVotosP;
    private String registroVotosD;
    private String totalVotosB;
    private String totalVotosN;
    private String numPapeletasSobrantesP;
    private String numPapeletasSobrantesD;
    private String cantidadVotantes;
    private String codigoVerificacion;
    private String fechaRegistroDatos;
    private String horaRegistroDatos;

    public RegistroDeVotos(String registroVotosP, String registroVotosD, String totalVotosB, String totalVotosN, String numPapeletasSobrantesP, String numPapeletasSobrantesD, String cantidadVotantes, String codigoVerificacion, String fechaRegistroDatos, String horaRegistroDatos) {
        this.registroVotosP = registroVotosP;
        this.registroVotosD = registroVotosD;
        this.totalVotosB = totalVotosB;
        this.totalVotosN = totalVotosN;
        this.numPapeletasSobrantesP = numPapeletasSobrantesP;
        this.numPapeletasSobrantesD = numPapeletasSobrantesD;
        this.cantidadVotantes = cantidadVotantes;
        this.codigoVerificacion = codigoVerificacion;
        this.fechaRegistroDatos = fechaRegistroDatos;
        this.horaRegistroDatos = horaRegistroDatos;
    }

    public String getRegistroVotosP() {
        return registroVotosP;
    }

    public void setRegistroVotosP(String registroVotosP) {
        this.registroVotosP = registroVotosP;
    }

    public String getRegistroVotosD() {
        return registroVotosD;
    }

    public void setRegistroVotosD(String registroVotosD) {
        this.registroVotosD = registroVotosD;
    }

    public String getTotalVotosB() {
        return totalVotosB;
    }

    public void setTotalVotosB(String totalVotosB) {
        this.totalVotosB = totalVotosB;
    }

    public String getTotalVotosN() {
        return totalVotosN;
    }

    public void setTotalVotosN(String totalVotosN) {
        this.totalVotosN = totalVotosN;
    }

    public String getNumPapeletasSobrantesP() {
        return numPapeletasSobrantesP;
    }

    public void setNumPapeletasSobrantesP(String numPapeletasSobrantesP) {
        this.numPapeletasSobrantesP = numPapeletasSobrantesP;
    }

    public String getNumPapeletasSobrantesD() {
        return numPapeletasSobrantesD;
    }

    public void setNumPapeletasSobrantesD(String numPapeletasSobrantesD) {
        this.numPapeletasSobrantesD = numPapeletasSobrantesD;
    }

    public String getCantidadVotantes() {
        return cantidadVotantes;
    }

    public void setCantidadVotantes(String cantidadVotantes) {
        this.cantidadVotantes = cantidadVotantes;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public String getFechaRegistroDatos() {
        return fechaRegistroDatos;
    }

    public void setFechaRegistroDatos(String fechaRegistroDatos) {
        this.fechaRegistroDatos = fechaRegistroDatos;
    }

    public String getHoraRegistroDatos() {
        return horaRegistroDatos;
    }

    public void setHoraRegistroDatos(String horaRegistroDatos) {
        this.horaRegistroDatos = horaRegistroDatos;
    }

    @Override
    public String toString() {
        return "RegistroDeVotos{" + "registroVotosP=" + registroVotosP + ", registroVotosD=" + registroVotosD + ", totalVotosB=" + totalVotosB + ", totalVotosN=" + totalVotosN + ", numPapeletasSobrantesP=" + numPapeletasSobrantesP + ", numPapeletasSobrantesD=" + numPapeletasSobrantesD + ", cantidadVotantes=" + cantidadVotantes + ", codigoVerificacion=" + codigoVerificacion + ", fechaRegistroDatos=" + fechaRegistroDatos + ", horaRegistroDatos=" + horaRegistroDatos + '}';
    }
   
    
}
