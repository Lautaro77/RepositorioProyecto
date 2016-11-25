package sistema;

public class Evaluacion {

    public int estrellas;
    public String resena;
    public Cliente cliente;

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evaluacion(int estrellas, String resena, Cliente cliente) {
        this.estrellas = estrellas;
        this.resena = resena;
        this.cliente = cliente;
    }

    public Evaluacion() {
        this.cliente = null;
    }

    @Override
    public String toString() {
        String ret = "";
        if (this.cliente == null) {
            ret += "Anónimo: ";
        }else{
            ret += this.cliente.getNombre() + ": ";
        }
        ret += this.estrellas + " Estrellas - " + this.resena;
        return ret;
    }

}
