package ec.iess.desarrollo.servicio;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.iess.desarrollo.dao.OrdenTrabajoRepository;
import ec.iess.desarrollo.modelo.OrdenTrabajo;

@Service
public class OrdenTrabajoService {

	@Autowired
	OrdenTrabajoRepository ordenTrabajoDao;
	
	
	public OrdenTrabajo crearOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
		ordenTrabajo.setFecha(new Date());
		ordenTrabajo.setEstado("REGISTRADO");
		return ordenTrabajoDao.save(ordenTrabajo); 
	}
	
	public Iterable<OrdenTrabajo> listarOrdenTrabajo(){
		return ordenTrabajoDao.findAll();
	}
	
	public Optional<OrdenTrabajo> obtenerPorId(Long id) {
		return ordenTrabajoDao.findById(id);
	}
}
