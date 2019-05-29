package questao_4;


public class Lembranca {
	protected String lugar;
	protected String deslocamento;
	Historico historia;
	
	
	public Lembranca() {
		historia = new Historico();
		lugar = new String();
		deslocamento = new String();
	}
	public void escrever_movimento(String movimentacao, String andar) {
		historia.adicionar_movimento(new Robo(lugar, deslocamento), null);
		lugar  += movimentacao;
		deslocamento += andar;
	}
	public void apagar_msg(){
		lugar = historia.getAtualizacao().getSalvo();
	}
	public void Alerta() {
		System.out.println(lugar);
		
	}

}
