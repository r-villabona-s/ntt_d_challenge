package ntt.data.challenge.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ntt.data.challenge.entity.Cliente;
import ntt.data.challenge.services.IClienteService;

@RestController
@CrossOrigin(methods = RequestMethod.GET)
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/cliente/{id}/{tipo}")
	public List<Cliente> getCliente(@PathVariable Map<Integer, String> pathVarsMap) {
		Integer id = Integer.parseInt(pathVarsMap.get("id"));
		String tipoId2 = pathVarsMap.get("tipo");

		if (tipoId2.matches("C") || tipoId2.matches("P")) {
			return clienteService.findClientById(id, tipoId2);
		} else {
			// manejar  mensaje 
			return null;
		}

	}

}
