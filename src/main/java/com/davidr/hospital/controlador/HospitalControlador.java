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
import com.davidr.hospital.modelo.entidad.Hospital;
import com.davidr.hospital.servicio.IHospitalServicio;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/hospital")
public class HospitalControlador {
	
	@Autowired
	private IHospitalServicio servicioHospital;
	
	@GetMapping
	public List<Hospital> listarHospital(){
		return servicioHospital.listarHospital();
	}
	
	@PostMapping
	public Hospital crearHospital(@RequestBody Hospital hospital) {
		return servicioHospital.insertarHospital(hospital);
	}
	
	@GetMapping("/{id}")
	public Hospital editarHospital(@PathVariable int id) {
		return servicioHospital.editarHospital(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarHospital(@PathVariable int id) {
		servicioHospital.eliminarHospital(id);
	}
}
