package com.davidr.hospital.modelo.entidad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;
@Entity
@Data
public class Departamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartamento;
	
	private String nombreDepartamento;
	private String ubicacionDepartamento;
	private String telefonoDepartamento;
	private String especialidad;
	
	@ManyToOne
	@JoinColumn(name = "id_hospital")
	private Hospital hospital;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "departamento", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Doctor> doctores = new ArrayList<>();
}
