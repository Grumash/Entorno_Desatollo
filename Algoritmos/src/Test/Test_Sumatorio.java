package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelos.Algoritmos;

class Test_Sumatorio {

		@Test
		void sumatorio() {
			int sumaEsperada=7;
			int sumaObtenida=Algoritmos.sumatorio(4);
			assertEquals(sumaEsperada,sumaObtenida);
		}
		
		@Test
		void factorial() {
			int factorioEsperada=24;
			int factorioObtenida=Algoritmos.Factorial(4);
			assertEquals(factorioEsperada,factorioObtenida);
		}
}
