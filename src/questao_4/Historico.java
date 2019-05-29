package questao_4;

import java.util.ArrayList;


public class Historico {
		protected ArrayList<Robo> movimento;
		protected ArrayList<Robo>velocidade;
		
		public Historico() {
			movimento = new ArrayList<Robo>();
			velocidade = new ArrayList<>();
		}
		public void adicionar_movimento(Robo movi, Robo vel) {
			movimento.add(movi);
			velocidade.add(vel);
			
		}
		public Robo getAtualizacao() {
			if(movimento.size() <= 0 && velocidade.size() <= 0){
				return new Robo("", "");
			}
			Robo movimento_Salvo = movimento.get(movimento.size() - 1);
			movimento.remove(movimento.size() - 1);
			return movimento_Salvo;
		}
		
}
