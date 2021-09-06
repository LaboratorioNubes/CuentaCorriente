package isi.dan.laboratorios.danmscuentacorriente.repositories;

import isi.dan.laboratorios.danmscuentacorriente.domain.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
