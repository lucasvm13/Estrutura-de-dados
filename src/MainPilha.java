
public class MainPilha {
	public static void main(String args[]) {
		
		Pilha p = new Pilha();
		
		p.empilhar(1);
		p.empilhar(3);
		p.empilhar(4);
		p.empilhar(10);
		
		while(!p.vazia()) {
			int elemento = p.desempilhar();
			System.out.println("Desempilhando " +elemento);
		}
		
		
	}

}
