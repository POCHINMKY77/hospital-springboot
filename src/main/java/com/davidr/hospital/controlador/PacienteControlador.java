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
import com.davidr.hospital.modelo.entidad.Paciente;
import com.davidr.hospital.servicio.IPacienteServicio;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/paciente")
public class PacienteControlador {
	
	@Autowired
	private IPacienteServicio servicioPaciente;
	
	@GetMapping
	public List<Paciente> listarPaciente(){
		return servicioPaciente.listarPaciente();
	}
	
	@PostMapping
	public Paciente crearPaciente(@RequestBody Paciente paciente) {
		return servicioPaciente.insertarPaciente(paciente);
	}
	
	@GetMapping("/{id}")
	public Paciente editarPaciente(@PathVariable int id) {
		return servicioPaciente.editarPaciente(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPaciente(@PathVariable int id) {
		servicioPaciente.eliminarPaciente(id);
	}
}
