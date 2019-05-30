package questao_2;

public class Investidor{
	private double salario;
	

	public Investidor(int cargo, double salario) {
	    this.salario = salario;
	    switch (cargo) {
	    case 1:
	        estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
	        cargo = Iniciante;
	        break;
	    case 2:
	        estrategiaDeCalculo = new CalculoImpostoQuinzeOuDez();
	        cargo = Expereinete;
	        break;
	    default:
	        throw new RuntimeException("Tipo de instidor não encontado: \n");
	    }
	}	
}