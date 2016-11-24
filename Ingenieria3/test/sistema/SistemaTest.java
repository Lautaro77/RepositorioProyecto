package sistema;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {
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
     * Test of getListaClientes method, of class Sistema.
     */
    @Test
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        Sistema instance = new Sistema();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getListaClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaClientes method, of class Sistema.
     */
    @Test
    public void testSetListaClientes() {
        System.out.println("setListaClientes");
        ArrayList<Cliente> listaClientes = null;
        Sistema instance = new Sistema();
        instance.setListaClientes(listaClientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRestaurante method, of class Sistema.
     */
    @Test
    public void testGetRestaurante() {
        System.out.println("getRestaurante");
        Sistema instance = new Sistema();
        Restaurante expResult = null;
        Restaurante result = instance.getRestaurante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRestaurante method, of class Sistema.
     */
    @Test
    public void testSetRestaurante() {
        System.out.println("setRestaurante");
        Restaurante restaurante = null;
        Sistema instance = new Sistema();
        instance.setRestaurante(restaurante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSorteo method, of class Sistema.
     */
    @Test
    public void testGetSorteo() {
        System.out.println("getSorteo");
        Sistema instance = new Sistema();
        Sorteo expResult = null;
        Sorteo result = instance.getSorteo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSorteo method, of class Sistema.
     */
    @Test
    public void testSetSorteo() {
        System.out.println("setSorteo");
        Sorteo sorteo = null;
        Sistema instance = new Sistema();
        instance.setSorteo(sorteo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaEvaluaciones method, of class Sistema.
     */
    @Test
    public void testGetListaEvaluaciones() {
        System.out.println("getListaEvaluaciones");
        Sistema instance = new Sistema();
        ArrayList<Evaluacion> expResult = null;
        ArrayList<Evaluacion> result = instance.getListaEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaEvaluaciones method, of class Sistema.
     */
    @Test
    public void testSetListaEvaluaciones() {
        System.out.println("setListaEvaluaciones");
        ArrayList<Evaluacion> listaEvaluaciones = null;
        Sistema instance = new Sistema();
        instance.setListaEvaluaciones(listaEvaluaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCliente method, of class Sistema.
     */
    @Test
    public void testCrearCliente_String_String() {
        System.out.println("crearCliente");
        String nombre = "";
        String email = "";
        Sistema instance = new Sistema();
        instance.crearCliente(nombre, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCliente method, of class Sistema.
     */
    @Test
    public void testCrearCliente_Cliente() {
        System.out.println("crearCliente");
        Cliente c = null;
        Sistema instance = new Sistema();
        instance.crearCliente(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearRestaurante method, of class Sistema.
     */
    @Test
    public void testCrearRestaurante() {
        System.out.println("crearRestaurante");
        String nombre = "";
        String direccion = "";
        String horarios = "";
        String tipoComida = "";
        Sistema instance = new Sistema();
        instance.crearRestaurante(nombre, direccion, horarios, tipoComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearEvaluacion method, of class Sistema.
     */
    @Test
    public void testCrearEvaluacion_3args() {
        System.out.println("crearEvaluacion");
        int estrellas = 0;
        String resena = "";
        Cliente cliente = null;
        Sistema instance = new Sistema();
        instance.crearEvaluacion(estrellas, resena, cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearEvaluacion method, of class Sistema.
     */
    @Test
    public void testCrearEvaluacion_Evaluacion() {
        System.out.println("crearEvaluacion");
        Evaluacion e = null;
        Sistema instance = new Sistema();
        instance.crearEvaluacion(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of definirSorteo method, of class Sistema.
     */
    @Test
    public void testDefinirSorteo() {
        System.out.println("definirSorteo");
        int numeroGanadores = 0;
        String premio = "";
        int dia = 0;
        int mes = 0;
        int anio = 0;
        Sistema instance = new Sistema();
        instance.definirSorteo(numeroGanadores, premio, dia, mes, anio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizarSorteo method, of class Sistema.
     */
    @Test
    public void testRealizarSorteo() throws Exception {
        System.out.println("realizarSorteo");
        Sistema instance = new Sistema();
        instance.realizarSorteo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enviarEmail method, of class Sistema.
     */
    @Test
    public void testEnviarEmail() throws Exception {
        System.out.println("enviarEmail");
        String mailDestinatario = "";
        String nombre = "";
        Sistema instance = new Sistema();
        instance.enviarEmail(mailDestinatario, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contactarGanador method, of class Sistema.
     */
    @Test
    public void testContactarGanador() {
        System.out.println("contactarGanador");
        Cliente ganador = null;
        Sistema instance = new Sistema();
        instance.contactarGanador(ganador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
