package com.davidr.hospital.modelo.entidad;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Cita implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	private LocalDateTime fechaHoraCita;
	private String motivoConsulta;
	private String estadoCita;
	private String observaciones;
	
	@ManyToOne
	@JoinColumn(name = "id_doctor")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
}