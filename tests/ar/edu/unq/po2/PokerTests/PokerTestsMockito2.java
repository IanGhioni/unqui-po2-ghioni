package ar.edu.unq.po2.PokerTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import tp.edu.unq.po2.Tdd.Poker.Carta;
import tp.edu.unq.po2.Tdd.Poker.PokerStatus;

class PokerTestsMockito2 {
	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}

	
	/*
	 Todos los casos posibles donde puede haber trio de cartas hasta la linea
	*/
	
	@Test
	void testTrioTrue1() { // Caso trio entre las cartas 1, 2 y 3
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(true);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue2() { // Caso trio entre las cartas 1, 4 y 3
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(true);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue3() { // Caso trio entre las cartas 1, 4 y 5
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(true);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue4() { // Caso trio entre las cartas 1, 2 y 4
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(true);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue5() { // Caso trio entre las cartas 1, 2 y 5
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(true);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue6() { // Caso trio entre las cartas 1, 5 y 3
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(true);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue7() { // Caso trio entre las cartas 5, 2 y 3
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(true);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue8() { // Caso trio entre las cartas 4, 2 y 3
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(true);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue9() { // Caso trio entre las cartas 5, 2 y 4
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(true);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioTrue10() { // Caso trio entre las cartas 3, 4 y 5
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(true);
		assertTrue(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioFalse1() {
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta4)).thenReturn(true);
		when(carta1.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta4)).thenReturn(false);
		when(carta1.haceTrioCon(carta2, carta5)).thenReturn(false);
		when(carta1.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta4)).thenReturn(false);
		when(carta2.haceTrioCon(carta4, carta5)).thenReturn(false);
		when(carta2.haceTrioCon(carta3, carta5)).thenReturn(false);
		when(carta3.haceTrioCon(carta4, carta5)).thenReturn(false);
		assertFalse(pokerStatus.jugadaEsTrio(carta1,carta2,carta3,carta4,carta5));
	}
	


	// Tests de jugada color
	
	@Test
	void testColorTrue1() {
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(true);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(true);
		assertTrue(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	
	@Test
	void testColorFalse1() {
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(true);
		when(carta3.paloIgualQue(carta4)).thenReturn(false);
		when(carta4.paloIgualQue(carta5)).thenReturn(true);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse2() {
		when(carta1.paloIgualQue(carta2)).thenReturn(false);
		when(carta2.paloIgualQue(carta3)).thenReturn(true);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(true);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse3() {
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(false);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(true);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	
	@Test
	void testColorFalse4() {
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(true);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(false);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse5() {
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(false);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(false);
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorFalse6() {
		when(carta1.paloIgualQue(carta2)).thenReturn(false);
		when(carta2.paloIgualQue(carta3)).thenReturn(false);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(false);
		
		assertFalse(pokerStatus.jugadaEsColor(carta1,carta2,carta3,carta4,carta5));
	}
	// Test jugada verificar
	
	@Test
	void testJugadaEsPokerYDevuelveStringPoquer() {
		when(carta1.hacePokerCon(carta2, carta3, carta4)).thenReturn(true);
		
		assertEquals("Poquer",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsColorYDevuelveStringColor() {
		
		when(carta1.paloIgualQue(carta2)).thenReturn(true);
		when(carta2.paloIgualQue(carta3)).thenReturn(true);
		when(carta3.paloIgualQue(carta4)).thenReturn(true);
		when(carta4.paloIgualQue(carta5)).thenReturn(true);
		
		
		assertEquals("Color",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsTrioYDevuelveStringTrio() {
		
		when(carta1.haceTrioCon(carta2, carta3)).thenReturn(true);
		assertEquals("Trio",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testJugadaEsNadaYDevuelveNada() {
		
		assertEquals("Nada",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
}
