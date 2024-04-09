package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelos.Algoritmos;

class Test_Sumatorio {

		@Test
		void sumatorio() {
			int sumaEsperada=10;
			int sumaObtenida=Algoritmos.sumatorio(4);
			assertEquals(sumaEsperada,sumaObtenida);
		}

}
