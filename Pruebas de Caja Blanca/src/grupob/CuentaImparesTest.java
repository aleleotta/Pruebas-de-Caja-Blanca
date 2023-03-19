package grupob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaImparesTest {
	int num = 0;
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	
	@Test
	void testCuentaImpares() {
		CuentaImpares cuenta = new CuentaImpares();
		int res = cuenta.cuentaImpares(num);
		assertEquals(0, res);
	}
	
	@Test
	void testCuentaImpares1() {
		CuentaImpares cuenta = new CuentaImpares();
		int res = cuenta.cuentaImpares(num1);
		assertEquals(1, res);
	}
	
	@Test
	void testCuentaImpares2() {
		CuentaImpares cuenta = new CuentaImpares();
		int res = cuenta.cuentaImpares(num2);
		assertEquals(1, res);
	}
	
	@Test
	void testCuentaImpares3() {
		CuentaImpares cuenta = new CuentaImpares();
		int res = cuenta.cuentaImpares(num3);
		assertEquals(2, res);
	}
}