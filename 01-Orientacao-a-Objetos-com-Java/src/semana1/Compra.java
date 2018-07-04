package semana1;

public class Compra {
	int valorTotal;
	int numParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numParcelas = 1;
	}
	
	// parcelado
	public Compra(int qntParcelas, int valorParcelas) {
		numParcelas = qntParcelas;
		valorTotal = valorParcelas * qntParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal / numParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumParcelas() {
		return numParcelas;
	}
	
}
