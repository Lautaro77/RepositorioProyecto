package sistema;

import java.util.ArrayList;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String horarios;
    private String tipoComida;
    private ArrayList<Evaluacion> listaEvaluaciones;

    public ArrayList<Evaluacion> getListaEvaluaciones() {
        return listaEvaluaciones;
    }

    public void setListaEvaluaciones(ArrayList<Evaluacion> listaEvaluaciones) {
        this.listaEvaluaciones = listaEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public Restaurante(String nombre, String direccion, String horarios, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarios = horarios;
        this.tipoComida = tipoComida;
        this.listaEvaluaciones = new ArrayList();
    }

    public Restaurante() {
        this.listaEvaluaciones = new ArrayList();
    }

    public boolean equals(Restaurante r) {
        return this.nombre.equals(r.getNombre());
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
