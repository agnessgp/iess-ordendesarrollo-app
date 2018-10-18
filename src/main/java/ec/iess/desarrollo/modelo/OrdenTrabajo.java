package ec.iess.desarrollo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="des_ordentrabajo_t")	
public class OrdenTrabajo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String modulo;
	private Date fecha;
	private String solicitado;
	private String cargo;
	private String tipoDesarrollo;
	private String referencia;
	private String funcionalidadActual;
	private String descripcionCambio;
	private String responsable;
	private String aprobado;
	private String observacion;
	private String estado;
		
	public OrdenTrabajo(Long id, String modulo, Date fecha, String solicitado, String cargo, String tipoDesarrollo,
			String referencia, String funcionalidadActual, String descripcionCambio, String responsable,
			String aprobado, String observacion, String estado) {
		super();
		this.id = id;
		this.modulo = modulo;
		this.fecha = fecha;
		this.solicitado = solicitado;
		this.cargo = cargo;
		this.tipoDesarrollo = tipoDesarrollo;
		this.referencia = referencia;
		this.funcionalidadActual = funcionalidadActual;
		this.descripcionCambio = descripcionCambio;
		this.responsable = responsable;
		this.aprobado = aprobado;
		this.observacion = observacion;
		this.estado = estado;
	}

	public OrdenTrabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getSolicitado() {
		return solicitado;
	}
	public void setSolicitado(String solicitado) {
		this.solicitado = solicitado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTipoDesarrollo() {
		return tipoDesarrollo;
	}
	public void setTipoDesarrollo(String tipoDesarrollo) {
		this.tipoDesarrollo = tipoDesarrollo;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getFuncionalidadActual() {
		return funcionalidadActual;
	}
	public void setFuncionalidadActual(String funcionalidadActual) {
		this.funcionalidadActual = funcionalidadActual;
	}
	public String getDescripcionCambio() {
		return descripcionCambio;
	}
	public void setDescripcionCambio(String descripcionCambio) {
		this.descripcionCambio = descripcionCambio;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getAprobado() {
		return aprobado;
	}
	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
