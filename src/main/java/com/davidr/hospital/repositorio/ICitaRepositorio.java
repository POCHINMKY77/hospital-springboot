package com.davidr.hospital.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidr.hospital.modelo.entidad.Cita;

@Repository
public interface ICitaRepositorio extends JpaRepository<Cita, Integer> {

}