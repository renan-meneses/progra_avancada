package questao_4;

public class Exec {

	public static void main(String[] args) {
		Lembranca passado = new Lembranca();
		passado.escrever_movimento("movimento x: 40 , y :20\n", "Velocidade  50\n");
		passado.escrever_movimento("movimento x: 90 , y :60\n", "Velocidade  80\n");
		passado.escrever_movimento("movimento x: 80 , y :50\n", "Velocidade  100\n");
		passado.escrever_movimento("movimento x: 20 , y :30\n", "Velocidade  70\n");
		passado.escrever_movimento("movimento x: 30 , y :70\n", "Velocidade  30\n");
		passado.escrever_movimento("movimento x: 60 , y :10\n", "Velocidade  10\n");
		passado.Alerta();
		passado.apagar_msg();
		passado.Alerta();
		passado.apagar_msg();
		passado.Alerta();
		passado.apagar_msg();
		passado.Alerta();
		passado.apagar_msg();
		passado.Alerta();
		passado.apagar_msg();
		passado.Alerta();
		passado.apagar_msg();
		
	
	}

}
