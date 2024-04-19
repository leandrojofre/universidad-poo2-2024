package ejComerciandoZapallos.main;

import java.util.Stack;

public class Agricultor {
	
	private Stack<Zapallo> pilaDeZapallos;

	public Agricultor() {
		this.pilaDeZapallos = new Stack<Zapallo>();
	}
	
	public void cosecharZapallo(int cantidad) {
		
		this.pilaDeZapallos.add(new Zapallo());
		
		if (cantidad <= 0) return;
		
		this.cosecharZapallo(cantidad - 1);
	}
	
	public Stack<Zapallo> verPilaDeZapallos() {
		return this.pilaDeZapallos;
	}
	
	public Stack<Zapallo> venderZapallos(int cantidad) {
		
		Stack<Zapallo> ventas = new Stack<Zapallo>();
		
		for (int i = cantidad; i > 0; i--)
			ventas.add(this.pilaDeZapallos.pop());
		
		return ventas;
	}

}
