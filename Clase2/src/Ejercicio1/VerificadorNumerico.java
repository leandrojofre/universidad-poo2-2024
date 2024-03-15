package Ejercicio1;

public class VerificadorNumerico {

	public VerificadorNumerico() {}
	
	public boolean esPrimo(int n) {
		
		if (n == 0) return false;
		
		for (int i = 1; i <= n/2; i++)
			if (i > 1 && (n % i) == 0) return false;
		
		return true;
	}

	public static void main(String[] args) {
		VerificadorNumerico verificador = new VerificadorNumerico();
		
		for (int i = 0; i <= 10; i++)
			if (verificador.esPrimo(i))
				System.out.println(i + " es primo");
	}
}
