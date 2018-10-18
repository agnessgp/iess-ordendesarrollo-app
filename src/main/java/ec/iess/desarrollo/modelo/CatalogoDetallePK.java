package ec.iess.desarrollo.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CatalogoDetallePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1853096325571628425L;
	private String codigoCatalogo;
	private String codigoDetalle;
	
	public CatalogoDetallePK(String codigoCatalogo, String codigoDetalle) {
		super();
		this.codigoCatalogo = codigoCatalogo;
		this.codigoDetalle = codigoDetalle;
	}
	public CatalogoDetallePK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCodigoCatalogo() {
		return codigoCatalogo;
	}
	public void setCodigoCatalogo(String codigoCatalogo) {
		this.codigoCatalogo = codigoCatalogo;
	}
	public String getCodigoDetalle() {
		return codigoDetalle;
	}
	public void setCodigoDetalle(String codigoDetalle) {
		this.codigoDetalle = codigoDetalle;
	}

	
	
}
