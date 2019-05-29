package questao_4;

public class Robo {
	protected String posicao;
	protected String velocidade;
	
	
	public Robo (String posicao, String velocidade) {
		this.posicao = posicao;
		this.velocidade = velocidade;
	}
	public String  getSalvo() {
		return (posicao + velocidade);
	}
	
}
