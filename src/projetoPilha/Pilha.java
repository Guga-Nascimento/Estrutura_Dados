package projetoPilha;

public class Pilha {

	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}

	// add novo no na pilha
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}

	// remove o ultimo nó colocado.
	public No pop() {
		if (!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}

	// topo
	public No top() {
		return refNoEntradaPilha;
	}

	// èsta vazia
	public boolean isEmpty() {// pergunta se a refNoEntradaPilha é null
		return refNoEntradaPilha == null ? true : false;
	}

	@Override
	public String toString() {
		
		String stringRetorno = "---------------------------\n";
		stringRetorno += "            Pilha\n";
		stringRetorno = "---------  Pilha ------------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while (true) {
			if (noAuxiliar != null) {
				
				stringRetorno += "[No { dado=" + noAuxiliar.getDado() + " }] \n";
				noAuxiliar = noAuxiliar.getRefNo();
				
			}else {
				break;
			}
		}
	
		return stringRetorno;
	

}
}
