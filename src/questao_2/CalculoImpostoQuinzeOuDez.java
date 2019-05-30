package questao_2;

public class CalculoImpostoQuinzeOuDez {
		protected double salario;
		protected double imposto;
	public CalculoImpostoQuinzeOuDez(double salario, double imposto) {
		this.salario = salario;
		this.imposto =imposto;
		if(salario >= 5000) {
			imposto = 0.1;
			salario = salario +(salario * imposto);
			System.out.println("Salrio: " + salario);
		}else {
			imposto = 0.125;
			salario = salario + (salario * imposto);
			System.out.println("Salrio: " + salario);
		}
		 
	}

}
