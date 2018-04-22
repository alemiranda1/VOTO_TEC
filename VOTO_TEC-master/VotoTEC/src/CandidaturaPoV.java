/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J.F Ballestero
 */
public class CandidaturaPoV {
    private String tipo;
    private String partidoPolitico;
    private String cedula;

    public CandidaturaPoV(String tipo, String partidoPolitico, String cedula) {
        this.tipo = tipo;
        this.partidoPolitico = partidoPolitico;
        this.cedula = cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "CandidaturaPoV{" + "tipo=" + tipo + ", partidoPolitico=" + partidoPolitico + ", cedula=" + cedula + '}';
    }
    
    
}
