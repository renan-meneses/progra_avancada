package questao_3;

public class PortaFechado implements PortaState {

	@Override
	public PortaState abrindo() {
		System.out.println("A porta esta abrindo");
		return new PortaAbrindo();
	}

	@Override
	public PortaState aberta() {
		System.out.println("Porta esta Aberta");
		return new PortaAberta();
	}

	@Override
	public PortaState fechado() {
		System.out.println("Porta esta Fechada");
		return this;
	}

	@Override
	public PortaState fechada() {
		System.out.println("Porta esta fechada");
		return new PortaFechada();
	}

}
