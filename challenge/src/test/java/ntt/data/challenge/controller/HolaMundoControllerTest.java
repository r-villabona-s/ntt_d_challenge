package ntt.data.challenge.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HolaMundoControllerTest {
	HolaMundoController hm = new HolaMundoController();
	@Test
	void HolaMundo() {
		assertEquals("hola EQUIPO1!!", hm.saludar());
	}

}
