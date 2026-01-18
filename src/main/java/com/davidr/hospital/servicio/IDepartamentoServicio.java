package com.davidr.hospital.servicio;

import java.util.List;
import com.davidr.hospital.modelo.entidad.Departamento;

public interface IDepartamentoServicio {
	public Departamento insertarDepartamento(Departamento nuevoDepartamento);
	public Departamento editarDepartamento(int idDepartamento);
	public void eliminarDepartamento(int idDepartamento);
	public List<Departamento> listarDepartamento();
}
