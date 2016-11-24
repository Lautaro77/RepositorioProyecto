package ingenieria;

import interfaz.*;
import sistema.Sistema;

public class Ingenieria {

    public static void main(String[] args) {

        Sistema s = new Sistema();
        s.crearRestaurante("Restaurante Darius", "asfas", "sadfasf", "sadfasdf");
        VentanaSeleccionRol v = new VentanaSeleccionRol(s);
    }

}
