package semana1;

public class Carro {
	int potencia;
	int velocidade;
	String nome;

	void acelerar() {
		velocidade += potencia;
	}
	
	void freiar() {
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	void imprimir() {
		System.out.println("O carro "+ nome +" esta com velocaide = "+ getVelocidade() + " km/h");
	}

}
