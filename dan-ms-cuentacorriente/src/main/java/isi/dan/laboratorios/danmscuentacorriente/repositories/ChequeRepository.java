package isi.dan.laboratorios.danmscuentacorriente.repositories;

import isi.dan.laboratorios.danmscuentacorriente.domain.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChequeRepository extends JpaRepository<Cheque, Integer> {
}
