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
    public void testGetListaClientesConElementos() {
        //Inicializacion
        Sistema s = new Sistema();
        Cliente c = new Cliente();
        c.setNombre("Roberto");
        c.setEmail("roberto@test");

        ArrayList<Cliente> listaPrueba = new ArrayList();
        listaPrueba.add(c);
        s.setListaClientes(listaPrueba);

        ArrayList<Cliente> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaClientes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testGetListaClientesVacia() {
        //Inicializacion
        Sistema s = new Sistema();

        ArrayList<Cliente> listaPrueba = new ArrayList();
        s.setListaClientes(listaPrueba);

        ArrayList<Cliente> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaClientes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setListaClientes method, of class Sistema.
     */
    @Test
    public void testSetListaClientesConElementos() {
        //Inicializacion
        Sistema s = new Sistema();
        Cliente c = new Cliente();
        c.setNombre("Roberto");
        c.setEmail("roberto@test");

        ArrayList<Cliente> resultadoEsperado = new ArrayList();
        resultadoEsperado.add(c);
        s.setListaClientes(resultadoEsperado);

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaClientes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetListaClientesVacia() {
        //Inicializacion
        Sistema s = new Sistema();

        ArrayList<Cliente> resultadoEsperado = new ArrayList();

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaClientes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getRestaurante method, of class Sistema.
     */
    @Test
    public void testGetRestaurante() {
        //Inicializacion
        Sistema s = new Sistema();
        Restaurante r = new Restaurante();
        s.setRestaurante(r);
        Restaurante resultadoEsperado = r;

        //Manipulacion
        Restaurante resultadoObtenido = s.getRestaurante();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setRestaurante method, of class Sistema.
     */
    @Test
    public void testSetRestaurante() {
        //Inicializacion
        Restaurante r = new Restaurante();
        Sistema s = new Sistema();
        s.setRestaurante(r);
        Restaurante resultadoEsperado = r;

        //Manipulacion
        Restaurante resultadoObtenido = s.getRestaurante();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of getSorteo method, of class Sistema.
     */
    @Test
    public void testGetSorteo() {
        //Inicializacion
        Sistema s = new Sistema();
        Sorteo so = new Sorteo();
        s.setSorteo(so);
        Sorteo resultadoEsperado = so;

        //Manipulacion
        Sorteo resultadoObtenido = s.getSorteo();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setSorteo method, of class Sistema.
     */
    @Test
    public void testSetSorteo() {
        //Inicializacion
        Sistema s = new Sistema();
        Sorteo so = new Sorteo();
        s.setSorteo(so);
        Sorteo resultadoEsperado = so;

        //Manipulacion
        Sorteo resultadoObtenido = s.getSorteo();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getListaEvaluaciones method, of class Sistema.
     */
    @Test
    public void testGetListaEvaluacionesConElementos() {
        //Inicializacion
        Sistema s = new Sistema();
        Evaluacion e = new Evaluacion();
        e.setCliente(null);
        e.setEstrellas(1);
        e.setResena("");

        ArrayList<Evaluacion> listaPrueba = new ArrayList();
        listaPrueba.add(e);
        s.setListaEvaluaciones(listaPrueba);

        ArrayList<Evaluacion> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = s.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testGetListaEvaluacionesVacia() {
        //Inicializacion
        Sistema s = new Sistema();

        ArrayList<Evaluacion> listaPrueba = new ArrayList();
        s.setListaEvaluaciones(listaPrueba);

        ArrayList<Evaluacion> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaClientes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setListaEvaluaciones method, of class Sistema.
     */
    @Test
    public void testSetListaEvaluacionesConElementos() {
        //Inicializacion
        Sistema s = new Sistema();
        Evaluacion e = new Evaluacion();
        e.setCliente(null);
        e.setEstrellas(1);
        e.setResena("");

        ArrayList<Evaluacion> resultadoEsperado = new ArrayList();
        resultadoEsperado.add(e);
        s.setListaEvaluaciones(resultadoEsperado);

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = s.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testSetListaEvaluacionesVacia() {
        //Inicializacion
        Sistema s = new Sistema();

        ArrayList<Evaluacion> resultadoEsperado = new ArrayList();

        //Manipulacion
        ArrayList<Evaluacion> resultadoObtenido = s.getListaEvaluaciones();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of definirSorteo method, of class Sistema.
     */
    @Test
    public void testDefinirSorteo() {
        //Inicializacion
        Sistema s = new Sistema();
        Sorteo resultadoEsperado = new Sorteo();
        int numeroGanadores = 0;
        String premio = "";
        int dia = 0;
        int mes = 0;
        int anio = 0;
        resultadoEsperado.setAnio(anio);
        resultadoEsperado.setDia(dia);
        resultadoEsperado.setMes(mes);
        resultadoEsperado.setNumeroGanadores(numeroGanadores);
        resultadoEsperado.setPremio(premio);
        s.definirSorteo(numeroGanadores, premio, dia, mes, anio);

        //Manipulacion
        Sorteo resultadoObtenido = s.getSorteo();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of realizarSorteo method, of class Sistema.
     */
    @Test
    public void testRealizarSorteo() throws Exception {
        
    }

    /**
     * Test of enviarEmail method, of class Sistema.
     */
    @Test
    public void testEnviarEmail() throws Exception {
        
    }

    /**
     * Test of contactarGanador method, of class Sistema.
     */
    @Test
    public void testContactarGanador() {
        
    }

}
