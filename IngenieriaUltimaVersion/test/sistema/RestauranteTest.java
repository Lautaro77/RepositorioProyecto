package sistema;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {

    public RestauranteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getListaEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testGetListaEvaluacionesConElementos() {
        //Inicializacion
        Restaurante r = new Restaurante();
        Evaluacion e = new Evaluacion();
        e.setCliente(null);
        e.setEstrellas(1);
        e.setResena("");

        ArrayList<Evaluacion> listaPrueba = new ArrayList();
        listaPrueba.add(e);
        r.setListaEvaluaciones(listaPrueba);

        ArrayList<Evaluacion> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = r.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetListaEvaluacionesVacia() {
        //Inicializacion
        Restaurante r = new Restaurante();

        ArrayList<Evaluacion> listaPrueba = new ArrayList();
        r.setListaEvaluaciones(listaPrueba);

        ArrayList<Evaluacion> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = r.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setListaEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testSetListaEvaluacionesConElementos() {
        //Inicializacion
        Restaurante r = new Restaurante();
        Evaluacion e = new Evaluacion();
        e.setCliente(null);
        e.setEstrellas(1);
        e.setResena("");

        ArrayList<Evaluacion> resultadoEsperado = new ArrayList();
        resultadoEsperado.add(e);
        r.setListaEvaluaciones(resultadoEsperado);

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = r.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    public void testSetListaEvaluacionesVacia() {
        //Inicializacion
        Restaurante r = new Restaurante();

        ArrayList<Evaluacion> resultadoEsperado = new ArrayList();

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = r.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        //Inicializacion
        Restaurante r = new Restaurante();
        r.setNombre("Restaurante");
        String resultadoEsperado = "Restaurante";

        //Manipulacion
        String resultadoObtenido = r.getNombre();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        //Inicializacion
        String nombre = "Restaurante";
        Restaurante r = new Restaurante();
        r.setNombre(nombre);
        String resultadoEsperado = "Restaurante";

        //Manipulacion
        String resultadoObtenido = r.getNombre();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        //Inicializacion
        Restaurante r = new Restaurante();
        r.setDireccion("Direccion");
        String resultadoEsperado = "Direccion";

        //Manipulacion
        String resultadoObtenido = r.getDireccion();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        //Inicializacion
        String direccion = "Direccion";
        Restaurante r = new Restaurante();
        r.setDireccion(direccion);
        String resultadoEsperado = "Direccion";

        //Manipulacion
        String resultadoObtenido = r.getDireccion();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getHorarios method, of class Restaurante.
     */
    @Test
    public void testGetHorarios() {
        //Inicializacion
        Restaurante r = new Restaurante();
        r.setHorarios("Horarios");
        String resultadoEsperado = "Horarios";

        //Manipulacion
        String resultadoObtenido = r.getHorarios();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setHorarios method, of class Restaurante.
     */
    @Test
    public void testSetHorarios() {
        //Inicializacion
        String horarios = "Horarios";
        Restaurante r = new Restaurante();
        r.setHorarios(horarios);
        String resultadoEsperado = "Horarios";

        //Manipulacion
        String resultadoObtenido = r.getHorarios();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getTipoComida method, of class Restaurante.
     */
    @Test
    public void testGetTipoComida() {
        //Inicializacion
        Restaurante r = new Restaurante();
        r.setTipoComida("Comida");
        String resultadoEsperado = "Comida";

        //Manipulacion
        String resultadoObtenido = r.getTipoComida();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setTipoComida method, of class Restaurante.
     */
    @Test
    public void testSetTipoComida() {
        //Inicializacion
        String comida = "Comida";
        Restaurante r = new Restaurante();
        r.setTipoComida(comida);
        String resultadoEsperado = "Comida";

        //Manipulacion
        String resultadoObtenido = r.getTipoComida();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

  

}
