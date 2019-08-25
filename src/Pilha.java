
public class Pilha {

	int elementos[];
	int topo;
	
	public Pilha() {
		elementos = new int [4];
		topo = -1; // valor invalido no vetor, determina que o vetor está vazio
	}
	
	
	public void empilhar(int e) {
		if(cheia()) { // verifica se a pilha está cheia
			throw new ArrayIndexOutOfBoundsException("Pilha cheia!");
		}
		topo++; // quando for inserido um elemento na pilha o topo é incrementado
		elementos[topo]=e;
	}
	
	public int desempilhar() {
		if(vazia()) { // verifica se a pilha está vazia
			throw new RuntimeException("Pilha vazia!");
		}
		int e;
		e=elementos[topo];
		topo--; //quando for desempilhado um elemento na pilha o topo é decrementado
		return e;
	}
	
	public boolean vazia() {
		return(topo==-1); 
	}
	
	public boolean cheia() {
		return(topo==9);
	}
	
	public int topo() {
		if(vazia()) {
			throw new RuntimeException("Pilha vazia!");
		}
		return elementos[topo];
	}
}
