package semana1;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "corcel";
		c1.velocidade = 0;
		
		Carro c2 = new Carro();
		c2.potencia = 20;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.freiar();
		
		c1.imprimir();
		c2.imprimir();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.freiar();
		
		c1.imprimir();
		c2.imprimir();

	}

}
