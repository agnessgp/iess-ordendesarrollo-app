package ec.iess.desarrollo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.iess.desarrollo.dao.CatalogoDetalleRepository;
import ec.iess.desarrollo.modelo.CatalogoDetalle;

@Service
public class CatalogoDetalleService {
	@Autowired
	CatalogoDetalleRepository catalogoDetalleDao;
	
	public List<CatalogoDetalle> listaCatalogoDetalle(String codigoCatalogo){
		return catalogoDetalleDao.findCatalogoDetalleCodigoParams("TIPDESA");
	}
}
