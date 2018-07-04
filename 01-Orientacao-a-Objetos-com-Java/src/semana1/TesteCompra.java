package semana1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void compraAvista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
	}
	
	@Test
	void compraParcelado() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumParcelas());
		assertEquals(1000, c.getValorTotal());
		assertEquals(250, c.getValorParcela());
	}
	 
}
