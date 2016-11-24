package sistema;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorteoTest {

    public SorteoTest() {
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
     * Test of getDia method, of class Sorteo.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Sorteo instance = null;
        int expResult = 0;
        int result = instance.getDia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDia method, of class Sorteo.
     */
    @Test
    public void testSetDia() {
        System.out.println("setDia");
        int dia = 0;
        Sorteo instance = null;
        instance.setDia(dia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Sorteo.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Sorteo instance = null;
        int expResult = 0;
        int result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMes method, of class Sorteo.
     */
    @Test
    public void testSetMes() {
        System.out.println("setMes");
        int mes = 0;
        Sorteo instance = null;
        instance.setMes(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnio method, of class Sorteo.
     */
    @Test
    public void testGetAnio() {
        System.out.println("getAnio");
        Sorteo instance = null;
        int expResult = 0;
        int result = instance.getAnio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnio method, of class Sorteo.
     */
    @Test
    public void testSetAnio() {
        System.out.println("setAnio");
        int anio = 0;
        Sorteo instance = null;
        instance.setAnio(anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaParticipantes method, of class Sorteo.
     */
    @Test
    public void testGetListaParticipantes() {
        System.out.println("getListaParticipantes");
        Sorteo instance = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getListaParticipantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaParticipantes method, of class Sorteo.
     */
    @Test
    public void testSetListaParticipantes() {
        System.out.println("setListaParticipantes");
        ArrayList<Cliente> listaParticipantes = null;
        Sorteo instance = null;
        instance.setListaParticipantes(listaParticipantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroGanadores method, of class Sorteo.
     */
    @Test
    public void testGetNumeroGanadores() {
        System.out.println("getNumeroGanadores");
        Sorteo instance = null;
        int expResult = 0;
        int result = instance.getNumeroGanadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroGanadores method, of class Sorteo.
     */
    @Test
    public void testSetNumeroGanadores() {
        System.out.println("setNumeroGanadores");
        int numeroGanadores = 0;
        Sorteo instance = null;
        instance.setNumeroGanadores(numeroGanadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPremio method, of class Sorteo.
     */
    @Test
    public void testGetPremio() {
        System.out.println("getPremio");
        Sorteo instance = null;
        String expResult = "";
        String result = instance.getPremio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPremio method, of class Sorteo.
     */
    @Test
    public void testSetPremio() {
        System.out.println("setPremio");
        String premio = "";
        Sorteo instance = null;
        instance.setPremio(premio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
