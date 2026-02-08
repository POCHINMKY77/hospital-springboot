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
import com.davidr.hospital.modelo.entidad.Cita;
import com.davidr.hospital.modelo.entidad.Doctor;
import com.davidr.hospital.modelo.entidad.Paciente;
import com.davidr.hospital.servicio.ICitaServicio;
import com.davidr.hospital.servicio.IDoctorServicio;
import com.davidr.hospital.servicio.IPacienteServicio;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cita")
public class CitaControlador {
	
	@Autowired
	private ICitaServicio servicioCita;
	
	@Autowired
	private IDoctorServicio servicioDoctor;
	
	@Autowired
	private IPacienteServicio servicioPaciente;
	
	@GetMapping
	public List<Cita> listarCita(){
		return servicioCita.listarCita();
	}
	
	@PostMapping
	public Cita crearCita(@RequestBody Cita cita) {
		
		if(cita.getDoctor() != null &&
		   cita.getDoctor().getIdDoctor() > 0 &&
		   cita.getPaciente() != null && 
		   cita.getPaciente().getIdPaciente() > 0) {
			
			Doctor doctor = servicioDoctor.editarDoctor(
					cita.getDoctor().getIdDoctor());
			Paciente paciente = servicioPaciente.editarPaciente(
					cita.getPaciente().getIdPaciente());
			
			if(doctor != null) {
				cita.setDoctor(doctor);
			}else {
				throw new RuntimeException(
						"El doctor no existe");
			}
			
			if(paciente != null) {
				cita.setPaciente(paciente);
			}else {
				throw new RuntimeException(
						"El paciente no existe");
			}
		}else {
			throw new RuntimeException(
					"Falta doctor o paciente");
		}
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
