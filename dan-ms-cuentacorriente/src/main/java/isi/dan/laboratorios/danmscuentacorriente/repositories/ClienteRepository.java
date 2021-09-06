package isi.dan.laboratorios.danmscuentacorriente.repositories;

import isi.dan.laboratorios.danmscuentacorriente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
