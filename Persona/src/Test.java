import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

import Modelos.Persona;

class PersonaTest {

	/**
	 * Comprueba que una persoana de 0 anhos se muestra como menor de edad
	 */
	@Test
	void test0() {
		Persona p2 = new Persona("Maria", "Garcia", 0);
		assertEquals("Menor de edad", p2.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de 17 anhos se muestra como menor de edad
	 */
	@Test
	void testMenorLimite() {
		Persona p3 = new Persona("Pedro", "Lopez", 17);
		assertEquals("Menor de edad", p3.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de 18 anhos se muestra como mayor de edad
	 */
	@Test
	void testMayorLimiteInferior() {
		Persona p4 = new Persona("Ana", "Martin", 18);
		assertEquals("Mayor de edad", p4.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de 30 anhos se muestra como menor de edad
	 */
	@Test
	void testMayor() {
		Persona p5 = new Persona("Roberto", "Sanchez", 30);
		assertEquals("Mayor de edad", p5.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de 65 anhos se muestra como mayor de edad
	 */
	@Test
	void testMayorLimiteSuperior() {
		Persona p6 = new Persona("Laura", "Gomez", 65);
		assertEquals("Mayor de edad", p6.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de 66 anhos se muestra como Jubilado
	 */
	@Test
	void testJubilado() {
		Persona p7 = new Persona("David", "Fernandez", 66);
		assertEquals("Jubilado", p7.mostrarEdad());
	}

	/**
	 * Comprueba que una persoana de -1 anhos saltara la exepcion implementada
	 */
	@Test
	void testEdadInvalida() {
		Persona p1 = new Persona("Juan", "Perez", -1);
		assertThrows(IllegalArgumentException.class, p1::getNombre);
	}

	/**
	 * Comprueba que una persoana de 130 anhos saltara la exepcion implementada
	 */
	@Test
	void testEdadInvalida2() {
		Persona p8 = new Persona("Miguel", "Rodriguez", 130);
		assertThrows(IllegalArgumentException.class, p8::getNombre);
	}

	/**
	 * Comprueba que una persoana de 131 anhos saltara la exepcion implementada
	 */
	@Test
	void testEdadInvalida3() {
		Persona p9 = new Persona("Carlos", "Alvarez", 131);
		assertThrows(IllegalArgumentException.class, p9::getNombre);
	}
}
