package semana1.pratica;

public class Paciente {
	
	double peso,altura,imc;

	/**
	 * Método Construtor
	 * @param peso
	 * @param altura
	 */
	Paciente(double peso,double altura){
		this.peso = peso;
		this.altura = altura;
	}

	void calcularIMC(){
		imc = peso/(altura*altura);
	}

	void diagnostico(){
		
		calcularIMC();
		
		System.out.println("IMC do Paciente = " + imc);
		System.out.print("Diagnóstico: ");
		
		if(imc <= 16){
			System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
		}else if(imc <= 16.99){
			System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
		}else if(imc <= 18.46){
			System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
		}else if(imc <= 24.99){
			System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
		}else if(imc <= 29.99){
			System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
		}else if(imc <= 34.99){
			System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
		}else if(imc <= 39.99){
			System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
		}else{
			System.out.println("Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²");
		}
		//um espaço vazio
		System.out.println();
	}
	
}

