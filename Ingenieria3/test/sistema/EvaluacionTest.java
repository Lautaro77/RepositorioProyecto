package sistema;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {

    public EvaluacionTest() {
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
     * Test of getEstrellas method, of class Evaluacion.
     */
    @Test
    public void testGetEstrellas() {
        System.out.println("getEstrellas");
        Evaluacion instance = new Evaluacion();
        int expResult = 0;
        int result = instance.getEstrellas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstrellas method, of class Evaluacion.
     */
    @Test
    public void testSetEstrellas() {
        System.out.println("setEstrellas");
        int estrellas = 0;
        Evaluacion instance = new Evaluacion();
        instance.setEstrellas(estrellas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResena method, of class Evaluacion.
     */
    @Test
    public void testGetResena() {
        System.out.println("getResena");
        Evaluacion instance = new Evaluacion();
        String expResult = "";
        String result = instance.getResena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResena method, of class Evaluacion.
     */
    @Test
    public void testSetResena() {
        System.out.println("setResena");
        String resena = "";
        Evaluacion instance = new Evaluacion();
        instance.setResena(resena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Evaluacion.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Evaluacion instance = new Evaluacion();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Evaluacion.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Evaluacion instance = new Evaluacion();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Evaluacion.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evaluacion instance = new Evaluacion();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
