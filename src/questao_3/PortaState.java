package questao_3;

public interface PortaState {
    PortaState abrindo();
 
    PortaState aberta();
 
    PortaState fechado();
 
    PortaState fechada();
}