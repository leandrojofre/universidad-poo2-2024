package Ejercicio12;

import java.util.ArrayList;

/*
	Implementar la clase Hotel tal que tenga operaciones para:
		a. Crearla con la cantidad de habitaciones que tiene.
		
		b. Ocupar una habitación disponible indicando la cantidad de
		personas mayores y menores (máximo 8 en total) que la ocuparán.
		
			void ocuparHabitacionCon(int mayores, int menores)
		
		c. Devolver la cantidad total de personas que ocupan todas las
		habitaciones del hotel.
		
		d. Devolver la cantidad de habitaciones que están ocupadas por
		tantos mayores como los indicados por parámetro.
		
			int contarHabitacionesCon(int mayores)
		
		e. Devolver un arreglo de enteros de longitud 9, tal que en la
		posición i del arreglo se guarde la cantidad de habitaciones
		con i personas.
 */

public class Hotel {
	
	private int numeroDeHabitaciones;
	private ArrayList<Habitacion> habitaciones;

	public Hotel(int numeroDeHabitaciones) {
		this.numeroDeHabitaciones = numeroDeHabitaciones;
		this.setHabitaciones(numeroDeHabitaciones);
	}
	
	private void setHabitaciones(int total) {
		this.habitaciones = new ArrayList<Habitacion>();
		
		for (int i = 0; i < total; i++)
			this.habitaciones.add(new Habitacion());		
	}
	
	public int getTotalDeOcupantes() {
		int ocupantes = 0;
		
		for (Habitacion habitacion : habitaciones) {
			ocupantes += habitacion.getOcupantes("mayores");
			ocupantes += habitacion.getOcupantes("menores");
		}
		
		return ocupantes;
	}
	
	public int contarHabitacionesCon(int mayores) {
		int habitacionesContadas = 0;
		
		for (Habitacion habitacion : habitaciones)
			if (habitacion.getOcupantes("mayores") == mayores)
				habitacionesContadas++;
		
		return habitacionesContadas;
	}

}
