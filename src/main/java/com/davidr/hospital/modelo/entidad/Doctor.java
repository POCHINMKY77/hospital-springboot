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
public class Doctor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDoctor;
	
	private String nombreDoctor;
	private String apellidoDoctor;
	private String cedulaDoctor;
	private String especialidadDoctor;
	private String telefonoDoctor;
	private String emailDoctor;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.REFRESH)
	@JsonBackReference
	private List<Cita> citas = new ArrayList<>();
}
