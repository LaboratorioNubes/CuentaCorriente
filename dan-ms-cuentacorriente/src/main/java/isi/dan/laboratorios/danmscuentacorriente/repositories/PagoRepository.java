package isi.dan.laboratorios.danmscuentacorriente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {

}
    
