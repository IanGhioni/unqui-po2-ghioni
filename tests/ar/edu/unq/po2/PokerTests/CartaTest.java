package ar.edu.unq.po2.PokerTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp.edu.unq.po2.Tdd.Poker.Carta;
import tp.edu.unq.po2.Tdd.Poker.Palo;
import tp.edu.unq.po2.Tdd.Poker.Valor;

class CartaTest {
	Carta carta1;
	Carta carta2;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testCartaValorSeisMayorQueCartaValorTres() {
		carta1 = new Carta(Valor.Seis,Palo.Trebol);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		assertTrue(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValorAsMayorQueCartaValorRey() {
		carta1 = new Carta(Valor.As,Palo.Trebol);
		carta2 = new Carta(Valor.Rey,Palo.Corazon);
		assertTrue(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValorReyMayorQueCartaValorReina() {
		carta1 = new Carta(Valor.Rey,Palo.Trebol);
		carta2 = new Carta(Valor.Reina,Palo.Corazon);
		assertTrue(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValorReyMayorQueCartaValorJota() {
		carta1 = new Carta(Valor.Rey,Palo.Trebol);
		carta2 = new Carta(Valor.Jota,Palo.Corazon);
		assertTrue(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValorReyMayorQueCartaValorAsReturnFalse() {
		carta1 = new Carta(Valor.Rey,Palo.Trebol);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		assertFalse(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValor10MayorQueCartaValorJotaReturnFalse() {
		carta1 = new Carta(Valor.Diez,Palo.Trebol);
		carta2 = new Carta(Valor.Jota,Palo.Corazon);
		assertFalse(carta1.valorMayorQue(carta2));
	}
	
	@Test
	void testCartaValorReyIgualQueCartaValorRey() {
		carta1 = new Carta(Valor.Rey,Palo.Trebol);
		carta2 = new Carta(Valor.Rey,Palo.Corazon);
		assertTrue(carta1.valorIgualQue(carta2));
	}
	
	@Test
	void testCartaValorAsIgualQueCartaValorAs() {
		carta1 = new Carta(Valor.As,Palo.Trebol);
		carta2 = new Carta(Valor.As,Palo.Corazon);
		assertTrue(carta1.valorIgualQue(carta2));
	}
	
	@Test
	void testCartaValorDosIgualQueCartaValorDos() {
		carta1 = new Carta(Valor.Dos,Palo.Trebol);
		carta2 = new Carta(Valor.Dos,Palo.Corazon);
		assertTrue(carta1.valorIgualQue(carta2));
	}
	
	@Test
	void testCartaValorDosIgualQueCartaValorTresFalso() {
		carta1 = new Carta(Valor.Dos,Palo.Trebol);
		carta2 = new Carta(Valor.Tres,Palo.Corazon);
		assertFalse(carta1.valorIgualQue(carta2));
	}
	
	@Test
	void testCartaValorAsIgualQueCartaValorReyFalso() {
		carta1 = new Carta(Valor.As,Palo.Trebol);
		carta2 = new Carta(Valor.Rey,Palo.Corazon);
		assertFalse(carta1.valorIgualQue(carta2));
	}
	
	@Test
	void testCartaPaloDiamanteIgualQueCartaPaloDiamante() {
		carta1 = new Carta(Valor.Dos,Palo.Diamante);
		carta2 = new Carta(Valor.Tres,Palo.Diamante);
		assertTrue(carta1.paloIgualQue(carta2));
	}
	
	@Test
	void testCartaPaloDiamanteNoIgualQueCartaPaloTrebol() {
		carta1 = new Carta(Valor.Dos,Palo.Diamante);
		carta2 = new Carta(Valor.Tres,Palo.Trebol);
		assertFalse(carta1.paloIgualQue(carta2));
	}
	
}
