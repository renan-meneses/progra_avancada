package questao_4;


public class Lembrança {
	protected String lugar;
	protected int deslocamento;
	Historico historia;
	
	
	public Lembrança() {
		historia = new Historico();
		lugar = new String();
	}
	public void escrever_movimento(String movimentacao) {
		historia.adicionar_movimento(new Robo(lugar, 0));
		lugar  += movimentacao;
	}
	public void apagar_msg(){
		lugar = historia.getAtualizacao().getSalvo();
	}
	public void Alerta() {
		System.out.println(lugar);
		
	}

}
