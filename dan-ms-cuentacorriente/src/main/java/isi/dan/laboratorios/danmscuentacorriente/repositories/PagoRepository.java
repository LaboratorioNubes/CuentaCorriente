package isi.dan.laboratorios.danmscuentacorriente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {

    @Query("FROM Pago p WHERE p.cliente = 1")
    List<Pago> findByCliente(@Param("idCliente") Integer idCliente);
}
    
