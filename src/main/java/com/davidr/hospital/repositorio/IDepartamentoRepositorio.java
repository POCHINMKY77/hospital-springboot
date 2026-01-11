package com.davidr.hospital.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidr.hospital.modelo.entidad.Departamento;

@Repository
public interface IDepartamentoRepositorio extends JpaRepository<Departamento, Integer> {

}
