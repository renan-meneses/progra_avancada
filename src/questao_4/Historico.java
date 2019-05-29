package questao_4;

import java.util.ArrayList;


public class Historico {
		protected ArrayList<Robo> movimento;
		
		public Historico() {
			movimento = new ArrayList<Robo>();
		}
		public void adicionar_movimento(Robo movi) {
			movimento.add(movi);
			
		}
		public Robo getAtualizacao() {
			if(movimento.size() <= 0){
				return new Robo("", 0);
			}
			Robo movimento_Salvo = movimento.get(movimento.size() - 1);
			movimento.remove(movimento.size() - 1);
			return movimento_Salvo;
		}
		
}
