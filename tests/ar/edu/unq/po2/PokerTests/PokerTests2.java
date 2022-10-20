package ar.edu.unq.po2.PokerTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp.edu.unq.po2.Tdd.Poker.Carta;
import tp.edu.unq.po2.Tdd.Poker.Palo;
import tp.edu.unq.po2.Tdd.Poker.PokerStatus;
import tp.edu.unq.po2.Tdd.Poker.Valor;

class PokerTests2 {
	
	PokerStatus pokerStatus = new PokerStatus();
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	
	/*
	 Todos los casos posibles donde puede haber trio de cartas hasta la linea 162
	*/
	
	@Test
	void testTrioTrue1() { // Caso trio entre las cartas 1, 2 y 3
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue2() { // Caso trio entre las cartas 1, 4 y 3
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue3() { // Caso trio entre las cartas 1, 4 y 5
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue4() { // Caso trio entre las cartas 1, 2 y 4
		carta1 = new Carta(Valor.Tres,Palo.Pica);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.Cinco,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue5() { // Caso trio entre las cartas 1, 2 y 5
		carta1 = new Carta(Valor.Rey,Palo.Pica);
		carta2 = new Carta(Valor.Rey,Palo.Corazon);
		carta3 = new Carta(Valor.Seis,Palo.Diamante);
		carta4 = new Carta(Valor.Cuatro,Palo.Trebol);
		carta5 = new Carta(Valor.Rey,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue6() { // Caso trio entre las cartas 1, 5 y 3
		carta1 = new Carta(Valor.Rey,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Rey,Palo.Diamante);
		carta4 = new Carta(Valor.Dos,Palo.Trebol);
		carta5 = new Carta(Valor.Rey,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue7() { // Caso trio entre las cartas 5, 2 y 3
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue8() { // Caso trio entre las cartas 4, 2 y 3
		carta1 = new Carta(Valor.Cinco,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue9() { // Caso trio entre las cartas 5, 2 y 4
		carta1 = new Carta(Valor.Cinco,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Seis,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.As,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue10() { // Caso trio entre las cartas 3, 4 y 5
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Tres,Palo.Diamante);
		carta4 = new Carta(Valor.Tres,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioFalse1() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		carta3 = new Carta(Valor.Dos,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioFalse2() {
		carta1 = new Carta(Valor.Cinco,Palo.Pica);
		carta2 = new Carta(Valor.Cuatro,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Ocho,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioFalse3() {
		carta1 = new Carta(Valor.Jota,Palo.Pica);
		carta2 = new Carta(Valor.Dos,Palo.Corazon);
		carta3 = new Carta(Valor.Reina,Palo.Diamante);
		carta4 = new Carta(Valor.Rey,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	
	
	
	
	// Tests de jugada color
	
	@Test
	void testColorTrue1() {
		carta1 = new Carta(Valor.Jota,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Pica);
		carta3 = new Carta(Valor.Diez,Palo.Pica);
		carta4 = new Carta(Valor.Dos,Palo.Pica);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorTrue2() {
		carta1 = new Carta(Valor.Ocho,Palo.Corazon);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.Cinco,Palo.Corazon);
		carta4 = new Carta(Valor.Seis,Palo.Corazon);
		carta5 = new Carta(Valor.Tres,Palo.Corazon);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorTrue3() {
		carta1 = new Carta(Valor.Seis,Palo.Diamante);
		carta2 = new Carta(Valor.Rey,Palo.Diamante);
		carta3 = new Carta(Valor.Jota,Palo.Diamante);
		carta4 = new Carta(Valor.Reina,Palo.Diamante);
		carta5 = new Carta(Valor.Tres,Palo.Diamante);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorTrue4() {
		carta1 = new Carta(Valor.As,Palo.Trebol);
		carta2 = new Carta(Valor.Rey,Palo.Trebol);
		carta3 = new Carta(Valor.Cuatro,Palo.Trebol);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Trebol);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorTrue5() {
		carta1 = new Carta(Valor.Reina,Palo.Diamante);
		carta2 = new Carta(Valor.Rey,Palo.Diamante);
		carta3 = new Carta(Valor.Diez,Palo.Diamante);
		carta4 = new Carta(Valor.Diez,Palo.Diamante);
		carta5 = new Carta(Valor.Tres,Palo.Diamante);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse1() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Dos,Palo.Corazon);
		carta3 = new Carta(Valor.Cinco,Palo.Diamante);
		carta4 = new Carta(Valor.Diez,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse2() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Jota,Palo.Corazon);
		carta3 = new Carta(Valor.Cuatro,Palo.Pica);
		carta4 = new Carta(Valor.Seis,Palo.Pica);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse3() {
		carta1 = new Carta(Valor.As,Palo.Diamante);
		carta2 = new Carta(Valor.Tres,Palo.Diamante);
		carta3 = new Carta(Valor.Siete,Palo.Diamante);
		carta4 = new Carta(Valor.Reina,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	
	@Test
	void testColorFalse4() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Reina,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Jota,Palo.Diamante);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	
	
	
	// Test jugada verificar
	
	@Test
	void testJugadaEsPokerYDevuelveStringPoquer() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.As,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsPoker(carta1,carta2,carta3,carta4,carta5));
		assertEquals("Poquer",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsColorYDevuelveStringColor() {
		carta1 = new Carta(Valor.As,Palo.Trebol);
		carta2 = new Carta(Valor.Reina,Palo.Trebol);
		carta3 = new Carta(Valor.Ocho,Palo.Trebol);
		carta4 = new Carta(Valor.Dos,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Trebol);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
		assertEquals("Color",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsTrioYDevuelveStringTrio() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Siete,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
		assertEquals("Trio",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsNadaYDevuelveNada() {
		carta1 = new Carta(Valor.As,Palo.Pica);
		carta2 = new Carta(Valor.Cuatro,Palo.Corazon);
		carta3 = new Carta(Valor.As,Palo.Diamante);
		carta4 = new Carta(Valor.Seis,Palo.Trebol);
		carta5 = new Carta(Valor.Tres,Palo.Pica);
		assertEquals("Nada",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
}
