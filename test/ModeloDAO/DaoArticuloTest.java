/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ModeloDAO;

import Modelo.ClsArticulo;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victo
 */
public class DaoArticuloTest {
    
    public DaoArticuloTest() {
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
     * Test of EliminarArticulo method, of class DaoArticulo.
     */
    @Test
    public void testEliminarArticulo() {
        System.out.println("EliminarArticulo");
        int idarticulo = 52;
        DaoArticulo instance = new DaoArticulo();
        boolean expResult = true;
        boolean result = instance.EliminarArticulo(idarticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of EditarArticulo method, of class DaoArticulo.
     */
    //@Test
    public void testEditarArticulo() {
        System.out.println("EditarArticulo");
        int codigo_articulo = 8;
        String nombre_articulo = "Vitamina C";
        int codigo_marca = 6;
        int codigo_categoria =3;
        int codigo_proveedor = 5;
        String descripcion_articulo = "Vitamina C 800mg";
        float precio_articulo = 8;
        int stock_articulo = 12;
        int stock_minimo_articulo = 4;
        int estado_articulo = 0;
        DaoArticulo instance = new DaoArticulo();
        boolean expResult = true;
        boolean result = instance.EditarArticulo(codigo_articulo, nombre_articulo, codigo_marca, codigo_categoria, codigo_proveedor, descripcion_articulo, precio_articulo, stock_articulo, stock_minimo_articulo, estado_articulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DetalleArticulo method, of class DaoArticulo.
     */
    //@Test
    public void testDetalleArticulo() {
        System.out.println("DetalleArticulo");
        int idarticulo = 29;
        DaoArticulo instance = new DaoArticulo();
        String expResult = "Protector Solar";
        String result = null;
        List list = instance.DetalleArticulo(idarticulo);
        Iterator<ClsArticulo> iter = list.iterator();
        String clase="";
        String descripcion="";
        while (iter.hasNext()) {
            ClsArticulo articulo = iter.next();
            result = articulo.getNombre_articulo();
        }
        System.out.println(result);
        //List result = instance.DetalleArticulo(idarticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     /**
     * Test of RegistrarArticulo method, of class DaoArticulo.
     */
   //@Test
    public void testRegistrarArticulo() {
        System.out.println("RegistrarArticulo");
        int codigo_articulo = 0;
        String nombre_articulo = "Vitamina E";
        int codigo_marca = 6;
        int codigo_categoria =3;
        int codigo_proveedor = 5;
        String descripcion_articulo = "Vitamina E 500mg";
        float precio_articulo = 8;
        int stock_articulo = 20;
        int stock_minimo_articulo = 4;
        int estado_articulo = 1;
        DaoArticulo instance = new DaoArticulo();
        boolean expResult = true;
        boolean result = instance.RegistrarArticulo(codigo_articulo, nombre_articulo, codigo_marca, codigo_categoria, codigo_proveedor, descripcion_articulo, precio_articulo, stock_articulo, stock_minimo_articulo, estado_articulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
