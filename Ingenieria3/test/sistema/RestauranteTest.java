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
    public void testGetListaEvaluaciones() {
        System.out.println("getListaEvaluaciones");
        Restaurante instance = new Restaurante();
        ArrayList<Evaluacion> expResult = null;
        ArrayList<Evaluacion> result = instance.getListaEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaEvaluaciones method, of class Restaurante.
     */
    @Test
    public void testSetListaEvaluaciones() {
        System.out.println("setListaEvaluaciones");
        ArrayList<Evaluacion> listaEvaluaciones = null;
        Restaurante instance = new Restaurante();
        instance.setListaEvaluaciones(listaEvaluaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Restaurante instance = new Restaurante();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Restaurante instance = new Restaurante();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorarios method, of class Restaurante.
     */
    @Test
    public void testGetHorarios() {
        System.out.println("getHorarios");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getHorarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorarios method, of class Restaurante.
     */
    @Test
    public void testSetHorarios() {
        System.out.println("setHorarios");
        String horarios = "";
        Restaurante instance = new Restaurante();
        instance.setHorarios(horarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoComida method, of class Restaurante.
     */
    @Test
    public void testGetTipoComida() {
        System.out.println("getTipoComida");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.getTipoComida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoComida method, of class Restaurante.
     */
    @Test
    public void testSetTipoComida() {
        System.out.println("setTipoComida");
        String tipoComida = "";
        Restaurante instance = new Restaurante();
        instance.setTipoComida(tipoComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Restaurante.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Restaurante r = null;
        Restaurante instance = new Restaurante();
        boolean expResult = false;
        boolean result = instance.equals(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Restaurante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Restaurante instance = new Restaurante();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
