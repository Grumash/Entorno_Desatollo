package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelos.Rectangulo;

class Test_Rectangulo {
	
	static Rectangulo r1;
	
	static Rectangulo r2;
	
	
	@BeforeAll
	static void setup() {
		
		r1= new Rectangulo();
		r2 = new Rectangulo(2,3);
		
	}
	
	@Test
	void arear1() { 
		
		double areaEsperada=1;
		double areaObtenida=r1.area();
		
		assertEquals(areaEsperada,areaObtenida);
	
	
	}
	@Test
	void arear2() { 
		
		double areaEsperada=6;
		double areaObtenida=r2.area();
		
		assertEquals(areaEsperada,areaObtenida);
	
	
	}
	@Test
	void perimetro1() { 
		
		double perimetroEsperada=1;
		double perimetroObtenida=r1.perimetro();
		
		assertEquals(perimetroEsperada,perimetroObtenida);
	
	
	}

	@Test
	void perimetro2() { 
		
		double perimetroEsperada=10;
		double perimetroObtenida=r2.perimetro();
		
		assertEquals(perimetroEsperada,perimetroObtenida);
	
	
	}
}
