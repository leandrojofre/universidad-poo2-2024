package ejComerciandoZapallos.main;

import java.util.Random;

public class Zapallo {

	static final int MAX_PRECIO = 21;
	static final int MIN_PRECIO = 1;
	private int precio;
	
	public Zapallo() {
		this.precio = new Random().nextInt(MIN_PRECIO, MAX_PRECIO);
	}
	
	public int verPrecio() {
		return this.precio;
	}
}
