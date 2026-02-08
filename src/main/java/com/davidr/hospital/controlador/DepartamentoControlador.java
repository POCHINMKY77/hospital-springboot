package com.davidr.hospital.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.davidr.hospital.modelo.entidad.Departamento;
import com.davidr.hospital.servicio.IDepartamentoServicio;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/departamento")
public class DepartamentoControlador {
	
	@Autowired
	private IDepartamentoServicio servicioDepartamento;
	
	@GetMapping
	public List<Departamento> listarDepartamento(){
		return servicioDepartamento.listarDepartamento();
	}
	
	@PostMapping
	public Departamento crearDepartamento(@RequestBody Departamento departamento) {
		return servicioDepartamento.insertarDepartamento(departamento);
	}
	
	@GetMapping("/{id}")
	public Departamento editarDepartamento(@PathVariable int id) {
		return servicioDepartamento.editarDepartamento(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarDepartamento(@PathVariable int id) {
		servicioDepartamento.eliminarDepartamento(id);
	}
}
