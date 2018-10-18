package ec.iess.desarrollo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ec.iess.desarrollo.modelo.CatalogoDetalle;

public interface CatalogoDetalleRepository extends CrudRepository<CatalogoDetalle, Long>{

	@Query("SELECT u FROM CatalogoDetalle u WHERE u.catalogoDetallePK.codigoCatalogo = :codigoCatalogo")
	List<CatalogoDetalle> findCatalogoDetalleCodigoParams(
	  @Param("codigoCatalogo") String codigoCatalogo);
}
