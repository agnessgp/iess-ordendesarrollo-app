package ec.iess.desarrollo.controlador;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ec.iess.desarrollo.modelo.CatalogoDetalle;
import ec.iess.desarrollo.modelo.Modulo;
import ec.iess.desarrollo.modelo.OrdenTrabajo;
import ec.iess.desarrollo.servicio.CatalogoDetalleService;
import ec.iess.desarrollo.servicio.ModuloService;
import ec.iess.desarrollo.servicio.OrdenTrabajoService;

@Controller
@SessionAttributes("ordentrabajo")
public class OrdenTrabajoController {

	@Autowired
	OrdenTrabajoService ordenTrabajoServicio;
	
	@Autowired
	ModuloService moduloServicio;
	
	@Autowired
	CatalogoDetalleService catalogoDetalleServicio;
	
	@RequestMapping(value="/formularioOrden")
	public String crear(Map<String,Object> model) {
		Iterable<Modulo> modulos = moduloServicio.listaModulos();
		List<CatalogoDetalle> listaTipoDesarrollo = catalogoDetalleServicio.listaCatalogoDetalle("TIPDESA");
		
		OrdenTrabajo ordentrabajo = new OrdenTrabajo();
		model.put("ordentrabajo", ordentrabajo);
		model.put("modulos", modulos);
		model.put("tipoDesarrollos", listaTipoDesarrollo);
		model.put("titulo", "Nueva Orden de Trabajo Desarrollo SW");
		return "formularioOrden";
	}
	
	@RequestMapping(value="/formulario" , method=RequestMethod.POST)
	public String guardar(OrdenTrabajo ordenTrabajo ) {
		ordenTrabajoServicio.crearOrdenTrabajo(ordenTrabajo);
		return "redirect:listar";
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
		Iterable<OrdenTrabajo> listarOrdenTrabajo = ordenTrabajoServicio.listarOrdenTrabajo(); 
		
		model.addAttribute("titulo", "Orden de Trabajo Desarrollo SW");
		model.addAttribute("listarOrdenTrabajo", listarOrdenTrabajo);
		return "listar";
	}
	
	@GetMapping("ver/{id}")
	public String ver(@PathVariable(value="id") Long id, Map<String,Object> model) {
		Optional <OrdenTrabajo> ordenTrabajoOptional=null;
		ordenTrabajoOptional = ordenTrabajoServicio.obtenerPorId(id);
		if(ordenTrabajoOptional.isPresent()){
			OrdenTrabajo ordenTrabajo = ordenTrabajoOptional.get();
		    model.put("ordenTrabajo",ordenTrabajo);
		}
		return "ver";
	}
}
