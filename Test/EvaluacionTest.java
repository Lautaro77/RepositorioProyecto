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
        //Inicializacion
        Evaluacion e = new Evaluacion();
        e.setEstrellas(1);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = e.getEstrellas();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setEstrellas method, of class Evaluacion.
     */
    @Test
    public void testSetEstrellas() {
        //Inicializacion
        int estrellas = 1;
        Evaluacion e = new Evaluacion();
        e.setEstrellas(estrellas);
        int resultadoEsperado = 1;

        //Manipulacion
        int resultadoObtenido = e.getEstrellas();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of getResena method, of class Evaluacion.
     */
    @Test
    public void testGetResena() {
        //Inicializacion
        Evaluacion e = new Evaluacion();
        e.setResena("Reseña");
        String resultadoEsperado = "Reseña";

        //Manipulacion
        String resultadoObtenido = e.getResena();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setResena method, of class Evaluacion.
     */
    @Test
    public void testSetResena() {
        //Inicializacion
        String resenia = "Reseña";
        Evaluacion e = new Evaluacion();
        e.setResena(resenia);
        String resultadoEsperado = "Reseña";

        //Manipulacion
        String resultadoObtenido = e.getResena();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of getCliente method, of class Evaluacion.
     */
    @Test
    public void testGetCliente() {
        //Inicializacion
        Evaluacion e = new Evaluacion();
        Cliente c = new Cliente();
        e.setCliente(c);
        Cliente resultadoEsperado = c;

        //Manipulacion
        Cliente resultadoObtenido = e.getCliente();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    /**
     * Test of setCliente method, of class Evaluacion.
     */
    @Test
    public void testSetCliente() {
        //Inicializacion
        Evaluacion e = new Evaluacion();
        Cliente c = new Cliente();
        e.setCliente(c);
        Cliente resultadoEsperado = c;

        //Manipulacion
        Cliente resultadoObtenido = e.getCliente();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);

    }

}
