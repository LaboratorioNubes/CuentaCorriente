package isi.dan.laboratorios.danmscuentacorriente.repositories;

import isi.dan.laboratorios.danmscuentacorriente.domain.Efectivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EfectivoRepository extends JpaRepository<Efectivo, Integer> {
}
