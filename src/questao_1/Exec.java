package questao_1;

public class Exec {

	public static void main(String[] args) {
		Policia policia = new Policia();
		policia.escreverMsg("Sem alarme!\n");
		policia.escreverMsg("Sem alarme!\n");
		policia.escreverMsg("Roubo em andamento\n");
		policia.Alerta();
		policia.apagar_msg();
		policia.Alerta();
		policia.apagar_msg();
		policia.Alerta();
		policia.apagar_msg();
	}

}
