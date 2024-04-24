package ntt.data.challenge.controller;

import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ntt.data.challenge.services.IFactorialService;

@RestController
@CrossOrigin(methods = RequestMethod.GET)
@RequestMapping("/api")
public class FactorialController {
	@Autowired
	private IFactorialService factoruialSrevice;

	@GetMapping("/factorial/{numero}")
	public BigInteger getFactorial(@PathVariable int numero) {
		return factoruialSrevice.getFactorial(numero);
	}

}
