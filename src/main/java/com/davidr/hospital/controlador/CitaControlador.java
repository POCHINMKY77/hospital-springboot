package com.davidr.hospital.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidr.hospital.modelo.entidad.Cita;
import com.davidr.hospital.servicio.ICitaServicio;

@RestController
@RequestMapping("/api/cita")
public class CitaControlador {
	
	@Autowired
	private ICitaServicio servicioCita;
	
	@GetMapping
	public List<Cita> listarCita(){
		return servicioCita.listarCita();
	}
	
	@PostMapping
	public Cita crearCita(@RequestBody Cita cita) {
		return servicioCita.insertarCita(cita);
	}
	
	@GetMapping("/{id}")
	public Cita editarCita(@PathVariable int id) {
		return servicioCita.editarCita(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCita(@PathVariable int id) {
		servicioCita.eliminarCita(id);
	}
}
