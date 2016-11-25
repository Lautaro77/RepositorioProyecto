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
    public void testGetDiaCorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setDia(1);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getDia();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetDiaIncorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setDia(0);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getDia() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setDia method, of class Sorteo.
     */
    @Test
    public void testSetDiaCorrecto() {
        //Inicializacion
        int dia = 1;
        Sorteo s = new Sorteo();
        s.setDia(dia);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getDia() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetDiaIncorrecto() {
        //Inicializacion
        int dia = 0;
        Sorteo s = new Sorteo();
        s.setDia(dia);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getDia() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getMes method, of class Sorteo.
     */
    @Test
    public void testGetMesCorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setMes(1);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getMes() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetMesIncorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setMes(0);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getMes() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setMes method, of class Sorteo.
     */
    @Test
    public void testSetMesCorrecto() {
        //Inicializacion
        int mes = 1;
        Sorteo s = new Sorteo();
        s.setMes(mes);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getMes() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetMesIncorrecto() {
        //Inicializacion
        int mes = 0;
        Sorteo s = new Sorteo();
        s.setDia(mes);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getMes() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getAnio method, of class Sorteo.
     */
    @Test
    public void testGetAnioCorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setAnio(1);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getAnio() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetAnioIncorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setAnio(0);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getAnio() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setAnio method, of class Sorteo.
     */
    @Test
    public void testSetAnioCorrecto() {
        //Inicializacion
        int anio = 1;
        Sorteo s = new Sorteo();
        s.setAnio(anio);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getAnio() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetAnioIncorrecto() {
        //Inicializacion
        int anio = 0;
        Sorteo s = new Sorteo();
        s.setAnio(anio);
        int resultadoEsperado = 0;
                
        //Manipulacion
        int resultadoObtenido = s.getAnio() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getListaParticipantes method, of class Sorteo.
     */
    @Test
    public void testGetListaParticipantesConElementos() {
        //Inicializacion
        Sorteo s = new Sorteo();
        Cliente c = new Cliente();
        c.setNombre("Roberto");
        c.setEmail("roberto@test");

        ArrayList<Cliente> listaPrueba = new ArrayList();
        listaPrueba.add(c);
        s.setListaParticipantes(listaPrueba);

        ArrayList<Cliente> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaParticipantes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
    
    @Test
    public void testGetListaParticipantesVacia() {
        //Inicializacion
        Sorteo s = new Sorteo();

        ArrayList<Cliente> listaPrueba = new ArrayList();
        s.setListaParticipantes(listaPrueba);

        ArrayList<Cliente> resultadoEsperado = listaPrueba;

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaParticipantes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setListaParticipantes method, of class Sorteo.
     */
    @Test
    public void testSetListaParticipantesConElementos() {
        //Inicializacion
        Sorteo s = new Sorteo ();
        Cliente c = new Cliente();
        c.setNombre("Roberto");
        c.setEmail("roberto@test");

        ArrayList<Cliente> resultadoEsperado = new ArrayList();
        resultadoEsperado.add(c);
        s.setListaParticipantes(resultadoEsperado);


        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaParticipantes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }
    
    @Test
    public void testSetListaParticipantesVacia() {
        //Inicializacion
        Sorteo s = new Sorteo ();

        ArrayList<Cliente> resultadoEsperado = new ArrayList();

        //Manipulacion
        ArrayList<Cliente> resultadoObtenido = s.getListaParticipantes();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of getNumeroGanadores method, of class Sorteo.
     */
    @Test
    public void testGetNumeroGanadoresCorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setNumeroGanadores(1);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getNumeroGanadores();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testGetNumeroGanadoresIncorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setNumeroGanadores(0);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getNumeroGanadores();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setNumeroGanadores method, of class Sorteo.
     */
    @Test
    public void testSetNumeroGanadoresCorrecto() {
        //Inicializacion
        int ganadores = 1;
        Sorteo s = new Sorteo();
        s.setNumeroGanadores(ganadores);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = s.getNumeroGanadores() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetNumeroGanadoresIncorrecto() {
        //Inicializacion
        int ganadores = 0;
        Sorteo s = new Sorteo();
        s.setNumeroGanadores(ganadores);
        int resultadoEsperado = 0;

        //Manipulacion
        int resultadoObtenido = s.getNumeroGanadores() ;

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getPremio method, of class Sorteo.
     */
    @Test
    public void testGetPremioCorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setPremio("Un paquete de yerba");
        String resultadoEsperado = "Un paquete de yerba";

        //Manipulacion
        String resultadoObtenido = s.getPremio();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void testGetPremioIncorrecto() {
        //Inicializacion
        Sorteo s = new Sorteo();
        s.setPremio("");
        String resultadoEsperado = "";

        //Manipulacion
        String resultadoObtenido = s.getPremio();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setPremio method, of class Sorteo.
     */
    @Test
    public void testSetPremioCorrecto() {
        //Inicializacion
        String premio = "Un paquete de yerba";
        Sorteo s = new Sorteo();
        s.setPremio(premio);
        String resultadoEsperado = "Un paquete de yerba";

        //Manipulacion
        String resultadoObtenido = s.getPremio();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testSetPremioIncorrecto() {
        //Inicializacion
        String premio = "";
        Sorteo s = new Sorteo();
        s.setPremio(premio);
        String resultadoEsperado = "";

        //Manipulacion
        String resultadoObtenido = s.getPremio();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}
