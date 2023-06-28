package projetoFila;

public class MainFila {

	public static void main(String[] args) {
	
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		
		System.out.println(minhaFila+" minha fila normal");		
		System.out.println("============================");		
		System.out.println(minhaFila.dequeue()+"captura o primeiro e remove ele da fila");
		System.out.println("============================");		
		minhaFila.enqueue("ultimo");
		System.out.println(minhaFila+"mostra que o enqueue add o 'ultimo' ");
		System.out.println("============================");
		System.out.println(minhaFila.first()+"apenas captura o primeiro da fila que nesse caso chama 'segundo'");
		System.out.println("============================");
		System.out.println(minhaFila);

	}

}
