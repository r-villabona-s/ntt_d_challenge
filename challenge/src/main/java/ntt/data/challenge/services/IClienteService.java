package ntt.data.challenge.services;

import java.util.List;
import ntt.data.challenge.entity.Cliente;
public interface IClienteService {
	public List<Cliente> findClientById(Integer id, String tipoDoc ); 
}
