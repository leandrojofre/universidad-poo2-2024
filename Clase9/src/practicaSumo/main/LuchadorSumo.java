package practicaSumo.main;

public class LuchadorSumo {
	
	private int peso;
	private int altura;
	private int combatesGanados;

	public LuchadorSumo(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
		this.combatesGanados = 0;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}
	
	public int getCombatesGanados() {
		return combatesGanados;
	}
	
	public void ganarCombate() {
		this.combatesGanados += 1;
	}

	public void dominar(LuchadorSumo rival) {

		if (this.peso <= rival.getPeso() && this.altura <= rival.getAltura())
			rival.ganarCombate();

		this.ganarCombate();
	}

}
