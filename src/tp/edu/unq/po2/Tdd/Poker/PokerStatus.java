package tp.edu.unq.po2.Tdd.Poker;

public class PokerStatus {

	public Boolean jugadaEsPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return
			carta1.hacePokerCon(carta2,carta3,carta4) 
			||
			carta2.hacePokerCon(carta3,carta4,carta5)
			||
			carta1.hacePokerCon(carta3, carta4, carta5)
			||
			carta1.hacePokerCon(carta2, carta4, carta5)
			||
			carta1.hacePokerCon(carta2, carta3, carta5);
		
	}

	public boolean jugadaEsTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		return 
			carta1.haceTrioCon(carta2,carta3) || carta1.haceTrioCon(carta3,carta4) || carta1.haceTrioCon(carta4,carta5)
		||	carta1.haceTrioCon(carta2,carta4) || carta1.haceTrioCon(carta2,carta5) || carta1.haceTrioCon(carta3,carta5)	
		|| 	carta2.haceTrioCon(carta3,carta4) || carta2.haceTrioCon(carta4,carta5) || carta3.haceTrioCon(carta4,carta5)
		||	carta2.haceTrioCon(carta3,carta5);	
	}

	public boolean jugadaEsColor(Carta carta1, Carta carta2,Carta carta3, Carta carta4, Carta carta5) {
		return
			this.verificarSi2CartasTienenElMismoPalo(carta1,carta2) &&
			this.verificarSi2CartasTienenElMismoPalo(carta2,carta3) &&
			this.verificarSi2CartasTienenElMismoPalo(carta3,carta4) &&
			this.verificarSi2CartasTienenElMismoPalo(carta4,carta5);
	}

	private boolean verificarSi2CartasTienenElMismoPalo(Carta carta1, Carta carta2) {
		return
			carta1.paloIgualQue(carta2);
	}

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String nombreDeJugada;
		if (this.jugadaEsTrioOColorOPoquer(carta1,carta2,carta3,carta4,carta5)) {
			nombreDeJugada = retornarNombreDeJugada(carta1,carta2,carta3,carta4,carta5);
		}
		else { 
			nombreDeJugada = "Nada"; 
		}
		return nombreDeJugada;
	}

	private String retornarNombreDeJugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String nombreDeJugada = null;
		if (this.jugadaEsTrio(carta1, carta2, carta3, carta4, carta5)) {
			nombreDeJugada = "Trio";
		}
		if (this.jugadaEsColor(carta1, carta2, carta3, carta4, carta5)) {
			nombreDeJugada = "Color";
		}
		if (this.jugadaEsPoker(carta1, carta2, carta3, carta4, carta5)) {
			nombreDeJugada = "Poquer";
		}
		return nombreDeJugada;
	}

	private boolean jugadaEsTrioOColorOPoquer(Carta carta1, Carta carta2, Carta carta3, Carta carta4,
			Carta carta5) {
		return 
			this.jugadaEsColor(carta1, carta2, carta3, carta4, carta5) || 
			this.jugadaEsPoker(carta1, carta2, carta3, carta4, carta5) || 
			this.jugadaEsTrio(carta1, carta2, carta3, carta4, carta5);
	}

}
