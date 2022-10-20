package tp.edu.unq.po2.Tdd.Poker;

public class Carta {
	private Valor valor;
	
	private Palo palo;
	
	public Carta(Valor valor, Palo palo) {
		this.setPalo(palo);
		this.setValor(valor);
	}
	
	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}
	
	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public boolean valorMayorQue(Carta carta2) {
		return this.getValorOrdinal() > carta2.getValorOrdinal();
	}

	public boolean valorIgualQue(Carta carta2) {
		return this.getValorOrdinal() == carta2.getValorOrdinal();
	}
	
	public int getValorOrdinal() {
		return
			this.getValor().ordinal();
	}

	public boolean paloIgualQue(Carta carta2) {
		return this.getPalo() == carta2.getPalo();
	}

	public boolean haceTrioCon(Carta carta2, Carta carta3) {
		
		return this.valorIgualQue(carta2) && carta2.valorIgualQue(carta3);
	}

	public boolean hacePokerCon(Carta carta2, Carta carta3, Carta carta4) {
		return this.valorIgualQue(carta2) && 
			   carta2.valorIgualQue(carta3) &&
			   carta3.valorIgualQue(carta4); 
	}
}
