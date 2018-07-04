package semana1.pratica;

public class PacienteMain {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(50, 1.95);
		paciente1.diagnostico();
		
		Paciente paciente2 = new Paciente(40, 1.50);
		paciente2.diagnostico();
		
		Paciente paciente3 = new Paciente(75, 1.75);
		paciente3.diagnostico();
	}
}
