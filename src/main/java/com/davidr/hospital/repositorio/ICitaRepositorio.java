package com.davidr.hospital.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.davidr.hospital.modelo.entidad.Cita;
@Repository
@Component
public interface ICitaRepositorio extends JpaRepository<Cita, Integer> {
}
