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
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;
@Entity
@Data
public class Hospital implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHospital;
	
	private String nombreHospital;
	private String direccionHospital;
	private String telefonoHospital;
	private String emailHospital;
	private String tipoHospital;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "hospital", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Departamento> departamentos = new ArrayList<>();
}
