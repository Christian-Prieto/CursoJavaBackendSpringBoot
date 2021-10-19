package es.com.inetum.elementos.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import es.com.inetum.elementos.modelo.ElementoFactory;
import es.com.inetum.elementos.modelo.Papel;
import es.com.inetum.elementos.modelo.Piedra;
import es.com.inetum.elementos.modelo.Tijera;

class ElementoFactoryTest {
	//lote de pruebas
	
	Piedra piedra ;
	Papel  papel;
	Tijera tijera;

	@Before
	public void setUp() throws Exception {
		
		//antes de cada testCase
		
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@After
	public void tearDown() throws Exception {
		
		//despues de cada testCase
		
		piedra = null;
		papel  = null;
		tijera = null;
	}

	@Test
	public void testCompararPiedraConTijera() {
		assertEquals(1, piedra.comparar(tijera));
		assertEquals("Piedra le gano a Tijera", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraConPapel() {
		assertEquals(-1, piedra.comparar(papel));
	}
	
	@Test
	public void testCompararPiedraConPiedra() {
		assertEquals(0, piedra.comparar(piedra));
	}

	@Test
	public void testGetInstancePiera() {
		assertTrue(ElementoFactory.getInstance(0) instanceof Piedra);
	}

	@Test
	public void testGetInstancePapel() {
		assertTrue(ElementoFactory.getInstance(1) instanceof Papel);
	}

	@Test
	public void testGetInstanceTijera() {
		assertTrue(ElementoFactory.getInstance(2) instanceof Tijera);
	}

}
