package ec.iess.desarrollo.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="des_catalogodetalle_t")	
public class CatalogoDetalle {

	@EmbeddedId
	private CatalogoDetallePK catalogoDetallePK;
	private String descripcion;
	private String valor;
	private int orden;
	private String estado;	
	
	
	public CatalogoDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CatalogoDetalle(CatalogoDetallePK catalogoDetallePK, String descripcion, String valor, int orden,
			String estado) {
		super();
		this.catalogoDetallePK = catalogoDetallePK;
		this.descripcion = descripcion;
		this.valor = valor;
		this.orden = orden;
		this.estado = estado;
	}


	public CatalogoDetallePK getCatalogoDetallePK() {
		return catalogoDetallePK;
	}


	public void setCatalogoDetallePK(CatalogoDetallePK catalogoDetallePK) {
		this.catalogoDetallePK = catalogoDetallePK;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public int getOrden() {
		return orden;
	}


	public void setOrden(int orden) {
		this.orden = orden;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	

	
}
