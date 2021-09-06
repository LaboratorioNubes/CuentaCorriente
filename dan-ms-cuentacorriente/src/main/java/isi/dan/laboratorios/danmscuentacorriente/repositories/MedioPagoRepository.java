package isi.dan.laboratorios.danmscuentacorriente.repositories;

import isi.dan.laboratorios.danmscuentacorriente.domain.MedioPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioPagoRepository extends JpaRepository<MedioPago, Integer> {
}
