package questao_1;

public class Policia {
	protected String msg;
	Alarme msg_secury;
	
	public Policia() {
		msg_secury = new Alarme();
		msg = new String();
	}
	public void escreverMsg(String novaMsg) {
		msg_secury.adicionar_estado_alarme(new Sensores(msg));
		msg += novaMsg;
	}
	public void apagar_msg(){
		msg = msg_secury.getAtualizacao().getAlarme();
	}
	public void Alerta() {
		System.out.println(msg);
		
	}
}
