package ar.edu.unq.po2.PokerTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp.edu.unq.po2.Tdd.Poker.Carta;
import tp.edu.unq.po2.Tdd.Poker.Palo;
import tp.edu.unq.po2.Tdd.Poker.PokerStatus;
import tp.edu.unq.po2.Tdd.Poker.Valor;

class PokerTests {
	private PokerStatus pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void testVerificarTrue() { // Las primeras 4 hacen poker
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarTrue2() { // Las ultimas 4 cartas hacen poker
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5)); 
	}
	
	@Test
	void testVerificarTrue3() { // la primera y las ultimas 3 hacen poker
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Corazon);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarTrue4() { // las primeras 2 y las ultimas 2 hacen poker
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Diamante);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	@Test
	void testVerificarTrue5() { // las primeras 3 y la ultima hacen poker
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Corazon);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	@Test
	void testVerificarTrueConCartaValor10() {
		carta1 = new Carta(Valor.Diez,Palo.Pica);
		carta2 = new Carta(Valor.Diez,Palo.Corazon);
		carta3 = new Carta(Valor.Diez,Palo.Diamante);
		carta4 = new Carta(Valor.Diez,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarTrueConCartaValorQ() {
		carta1 = new Carta(Valor.Reina,Palo.Pica);
		carta2 = new Carta(Valor.Reina,Palo.Corazon);
		carta3 = new Carta(Valor.Reina,Palo.Diamante);
		carta4 = new Carta(Valor.Reina,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarFalse() {
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Dos,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Seis,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarFalse2() {
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testVerificarFalse3() {
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
	}
}
