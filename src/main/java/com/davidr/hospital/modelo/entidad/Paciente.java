package com.davidr.hospital.modelo.entidad;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	private String nombrePaciente;
	private String apellidoPaciente;
	private String cedulaPaciente;
	private LocalDate fechaNacimiento;
	private String telefonoPaciente;
	private String emailPaciente;
	private String direccionPaciente;
	private String tipoSangre;
	
	@OneToMany(mappedBy = "paciente")
	private List<Cita> citas;
}
