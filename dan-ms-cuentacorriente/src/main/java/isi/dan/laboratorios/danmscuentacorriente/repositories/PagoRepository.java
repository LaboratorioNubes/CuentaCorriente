package isi.dan.laboratorios.danmscuentacorriente.repositories;

import org.springframework.stereotype.Repository;

import frsf.isi.dan.InMemoryRepository;
import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;

@Repository
public class PagoRepository extends InMemoryRepository<Pago> {

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {}

    @Override
    public Integer getId(Pago p) {
        return p.getId();
    }

    @Override
    public void setId(Pago p, Integer id) {
        p.setId(id);
    }

}
    
