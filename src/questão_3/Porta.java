package questão_3;

public class Porta {
	    protected PortaState estado;
	     
	    public Porta() {
	        estado = new PortaAberta();
	    }
	 
	    public void abrindo() {
	        estado = estado.abrindo();
	    }
	 
	    public void aberta() {
	        estado = estado.aberta();
	    }
	 
	    public void fechando() {
	        estado = estado.fechado();
	    }
	 
	    public void levarDano() {
	        estado = estado.fechada();
	    }
	}

