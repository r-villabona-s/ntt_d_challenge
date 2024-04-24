package ntt.data.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	private String teamName = "EQUIPO1";
	@GetMapping(path="/api/hola")
	public String saludar() {
		return "hola " + teamName + "!!";

	}

}
