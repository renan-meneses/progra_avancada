package questao_3;

public class PortaAberta implements PortaState {

	@Override
	public PortaState abrindo() {
		System.out.println("A porta esta abrindo");
		return new PortaAbrindo();
	}

	@Override
	public PortaState aberta() {
		System.out.println("Porta esta Aberta");
		return this;
	}

	@Override
	public PortaState fechado() {
		System.out.println("Porta esta Fechada");
		return new PortaFechado();
	}

	@Override
	public PortaState fechada() {
		System.out.println("Porta esta fechada");
		return new PortaFechada();
	}

}
