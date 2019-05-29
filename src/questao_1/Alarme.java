package questao_1;

import java.util.ArrayList;

public class Alarme {
	protected ArrayList<Sensores> estados;

	public Alarme() {
		estados = new ArrayList<Sensores>();
	}
	public void adicionar_estado_alarme(Sensores daodos) {
		estados.add(daodos);
	}
	public Sensores getAtualizacao() {
		if(estados.size() <= 0){
			return new Sensores(" ");
		}
		Sensores dadosSalvo = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		return dadosSalvo;
	}
}
