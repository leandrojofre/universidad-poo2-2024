package Ejercicio12;

import java.util.HashMap;
import java.util.Map;

/*
 	b. Ocupar una habitación disponible indicando la cantidad de
	personas mayores y menores (máximo 8 en total) que la ocuparán.
		
		void ocuparHabitacionCon(int mayores, int menores)
 */

public class Habitacion {
	
	static final int MAXIMA_CAPACIDAD = 8;
	private Map<String, Integer> ocupantes = new HashMap<>();

	public Habitacion() {
		this.ocupantes.put("mayores", 0);
		this.ocupantes.put("menores", 0);
	}
	
	public void ocuparHabitacionCon(int mayores, int menores) {
		int personasAfuera = MAXIMA_CAPACIDAD - (mayores + menores);
		
		if (personasAfuera > 0) return;
		
		this.ocupantes.replace("mayores", mayores);
		this.ocupantes.replace("menores", menores);
	}
	
	public int getOcupantes(String rangoEtario) {
		return ocupantes.get(rangoEtario);
	}

}
