package Ejercicio5;

public class CalculadoraDeMatrices {

	public CalculadoraDeMatrices() {
	}

	public int[][] sumar(int m1[][], int m2[][]) {
		int resultado[][] = new int[m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			int[] row1 = m1[i];
			int[] row2 = m2[i];
			
			for (int j = 0; j < row1.length; j++) {
				int col1 = row1[j];
				int col2 = row2[j];
				resultado[i][j] = col1 + col2;
			}			
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		int matriz1[][] = {{2, 2}, {3, 4}};
		int matriz2[][] = {{4, 3}, {2, 1}};
		CalculadoraDeMatrices calculadora = new CalculadoraDeMatrices();
		
		for (int[] row : calculadora.sumar(matriz1, matriz2)) {
			for (int col : row) {
				System.out.println("Resultado: " + col);
			}
		}
	}
}
