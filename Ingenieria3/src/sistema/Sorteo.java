package sistema;

import java.util.ArrayList;

public class Sorteo {

    private ArrayList<Cliente> listaParticipantes;
    private int numeroGanadores;
    private String premio;
    private int dia;
    private int mes;
    private int anio;

    public Sorteo(ArrayList<Cliente> listaParticipantes, int numeroGanadores, String premio, int dia, int mes, int anio) {
        this.listaParticipantes = listaParticipantes;
        this.numeroGanadores = numeroGanadores;
        this.premio = premio;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<Cliente> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Cliente> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public int getNumeroGanadores() {
        return numeroGanadores;
    }


    public void setNumeroGanadores(int numeroGanadores) {
        this.numeroGanadores = numeroGanadores;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

   

}
