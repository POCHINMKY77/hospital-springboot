package com.davidr.hospital.modelo.entidad;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;
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
	
	@ToString.Exclude
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Cita> citas = new ArrayList<>();
}
