package ingenieria;

import interfaz.*;
import sistema.Sistema;

public class Ingenieria {

    public static void main(String[] args) {

        Sistema s = new Sistema();
        s.crearRestaurante("Restaurante Darius", "Plaza Independencia 848", "20:00 p.m - 02:00a.m", "A la parrila");
        VentanaSeleccionRol v = new VentanaSeleccionRol(s);
    }

}
