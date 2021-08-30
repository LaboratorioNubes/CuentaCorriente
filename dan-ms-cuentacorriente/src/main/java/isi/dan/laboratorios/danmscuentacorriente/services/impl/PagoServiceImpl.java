package isi.dan.laboratorios.danmscuentacorriente.services.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;
import isi.dan.laboratorios.danmscuentacorriente.dtos.PagoDTO;
import isi.dan.laboratorios.danmscuentacorriente.repositories.PagoRepository;
import isi.dan.laboratorios.danmscuentacorriente.services.PagoService;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepo;

    Pago pagoNuevo;

    @Override
    public Optional<Pago> buscarPago(Integer id) {
        return this.pagoRepo.findById(id);
    }

    @Override
    public Iterable<Pago> buscarPagos() {
        return this.pagoRepo.findAll();
    }

    @Override
    public Pago guardarPago(PagoDTO pago) {
        pagoNuevo = new Pago();
        pagoNuevo.setCliente(pago.getCliente());
        pagoNuevo.setFechaPago(pago.getFechaPago());
        pagoNuevo.setMedio(pago.getMedio());

        return this.pagoRepo.save(pagoNuevo);
    }

    @Override
    public Optional<Pago> actualizarPago(PagoDTO pago, Integer id) {
        // TODO Not possible without bdd
        return null;
    }

    @Override
    public void borrarPago(Integer id) {
        this.pagoRepo.deleteById(id);
    }

    @Override
    public Iterable<Pago> buscarPagosPorCliente(Integer idCliente) {
        // TODO Not possible without bdd
        return null;
    }
    
}
