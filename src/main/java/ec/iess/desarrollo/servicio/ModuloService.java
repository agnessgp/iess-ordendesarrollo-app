package ec.iess.desarrollo.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.iess.desarrollo.dao.ModuloRepository;
import ec.iess.desarrollo.modelo.Modulo;

@Service
public class ModuloService {

	@Autowired
	ModuloRepository moduloDao;
	
	public Iterable<Modulo> listaModulos(){
		return moduloDao.findAll();
	}
	
}
