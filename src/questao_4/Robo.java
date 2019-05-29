package questao_4;

public class Robo {
	protected String posicao;
	protected int velocidade;
	
	
	public Robo (String posicao, int velocidade) {
		this.posicao = posicao;
		this.velocidade = velocidade;
	}
	public String  getSalvo() {
		return posicao;
	}
	public int getVelocidade() {
		return velocidade;
		
	}
}
