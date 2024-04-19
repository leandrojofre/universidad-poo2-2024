package practicaSumo.main;

import java.util.ArrayList;

public class RingSumo {

	public RingSumo() {}

	public void enfrentarLuchadores(LuchadorSumo oponente1, LuchadorSumo oponente2) {
		oponente1.dominar(oponente2);
	}
	
	public void jugarTorneo(ArrayList<LuchadorSumo> oponentes) {
		
		for (int i = 0; i < oponentes.size(); i++) {			
			LuchadorSumo peleador = oponentes.get(i);
			
			for (int j = i; j < oponentes.size(); j++) {				
				if (j == i) continue;
				
				LuchadorSumo rival = oponentes.get(j);
				
				this.enfrentarLuchadores(peleador, rival);
			}
		}
		
		// TODO: Continuar en clase
	}

}
