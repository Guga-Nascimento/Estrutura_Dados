package projetoFila;


public class Fila {

	private No refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	// èsta vazia
		public boolean isEmpty() {// pergunta se a refNoEntradaFila é null
			return refNoEntradaFila == null ? true : false;
		}
		
	//enfileirar
	public void enqueue(Object obj) {
		No novoNo = new No(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	public Object first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
					}else {
						break;
					}
			}
			return primeiroNo.getObject();
		}
		return null;
	}
	public Object dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
					}else {
						noAuxiliar.setRefNo(null);
						break;
					}
			}
			return primeiroNo.getObject();
		}
		return null;
	}
	@Override
	public String toString() {
		String retorno = "";
		No noAux = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				retorno += "[No{objeto="+ noAux.getObject()+ "}]--->";
				if(noAux.getRefNo() != null) {
					noAux = noAux.getRefNo();
				}else {
					retorno+= null;
					break;
				}				
			}
		}else {
			retorno = "null";
		}		
		return retorno;		
	}
	
	
}
