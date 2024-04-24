package ntt.data.challenge.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import ntt.data.challenge.entity.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Override
	public List<Cliente> findClientById(Integer id, String tipoDoc) {
	
	  Cliente cli = new Cliente(); 	
	  cli.setApellido1("Doe");
	  cli.setNombre1("Jhon");
	  cli.setCiudadResid("Bogota");
	  cli.setTelefono("123 123 12 12");
	  
	  List<Cliente> cliente = new ArrayList<Cliente>();
	  cliente.add(cli);
	  
	  return cliente;
	}

}
