package grupoa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaNumerosTest {
	int num = 3;
	int num1 = 6;
	int num2 = -1;
	int num3 = 2;
	
	@Test
	void testSumaNumeros() {
		SumaNumeros suma = new SumaNumeros();
		int res = suma.sumaNumeros(num);
		assertEquals(2, res);
	}
	
	@Test
	void testSumaNumeros1() {
		SumaNumeros suma = new SumaNumeros();
		int res = suma.sumaNumeros(num1);
		assertEquals(6, res);
	}
	
	@Test
	void testSumaNumeros2() {
		SumaNumeros suma = new SumaNumeros();
		int res = suma.sumaNumeros(num2);
		assertEquals(0, res);
	}
	
	@Test
	void testSumaNumeros3() {
		SumaNumeros suma = new SumaNumeros();
		int res = suma.sumaNumeros(num3);
		assertEquals(0, res);
	}
}

/*
 *V(G)=Regions
 *A-N+2 A=Arrows N=Nodes
 *V(G)=NP+1 NP=PredicatedNodes
 */