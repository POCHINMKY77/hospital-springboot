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

import com.davidr.hospital.modelo.entidad.Doctor;
import com.davidr.hospital.servicio.IDoctorServicio;

@RestController
@RequestMapping("/api/doctor")
public class DoctorControlador {
	
	@Autowired
	private IDoctorServicio servicioDoctor;
	
	@GetMapping
	public List<Doctor> listarDoctor(){
		return servicioDoctor.listarDoctor();
	}
	
	@PostMapping
	public Doctor crearDoctor(@RequestBody Doctor doctor) {
		return servicioDoctor.insertarDoctor(doctor);
	}
	
	@GetMapping("/{id}")
	public Doctor editarDoctor(@PathVariable int id) {
		return servicioDoctor.editarDoctor(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarDoctor(@PathVariable int id) {
		servicioDoctor.eliminarDoctor(id);
	}
}
