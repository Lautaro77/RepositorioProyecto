package sistema;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    public ClienteTest() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombreCorrecto() {
       
         //Inicializacion
        Cliente c = new Cliente();
        c.setNombre("Gonzalo");
        String resultadoEsperado = "Gonzalo";
        //Manipulacion
        String resultadoObtenido = c.getNombre();
        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
 
        
    }
    @Test
      public void testGetNombreIncorreto() {
          //Inicializacion
        Cliente c = new Cliente();
        c.setNombre("");
        String resultadoEsperado = "";
        //Manipulacion
        String resultadoObtenido = c.getNombre();
        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
 
        
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombreCorrecto() {
         //Inicializacion
        String nombre = "Roberto";
        Cliente c = new Cliente();
        c.setNombre(nombre);
        String resultadoEsperado = "Roberto";

        //Manipulacion
        String resultadoObtenido = c.getNombre();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void testSetNombreIncorrecto() {
         //Inicializacion
        String nombre = "";
        Cliente c = new Cliente();
        c.setNombre(nombre);
        String resultadoEsperado = "";

        //Manipulacion
        String resultadoObtenido = c.getNombre();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmailCorrecto() {
  //Inicializacion
        
        Cliente c = new Cliente();
        c.setEmail("lautalon7@gmail.com");
        String resultadoEsperado = "lautalon7@gmail.com";
        //Manipulacion
        String resultadoObtenido = c.getEmail();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

        @Test
    public void testGetEmailIncorrecto() {
  //Inicializacion
        
        Cliente c = new Cliente();
        c.setEmail("");
        String resultadoEsperado = "";
        //Manipulacion
        String resultadoObtenido = c.getEmail();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
     @Test
    public void testSetEmailCorrecto() {
  //Inicializacio
        String email = "juanluisberti@gmail.com";
        Cliente c = new Cliente();
        c.setEmail(email);
        String resultadoEsperado = "lautalon7@gmail.com";
        //Manipulacion
        String resultadoObtenido = c.getEmail();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
        @Test
    public void testSetEmailIncorrecto() {
  //Inicializacio
        String email = "";
        Cliente c = new Cliente();
        c.setEmail(email);
        String resultadoEsperado = "lautalon7@gmail.com";
        //Manipulacion
        String resultadoObtenido = c.getEmail();

        //Verificacion
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}
