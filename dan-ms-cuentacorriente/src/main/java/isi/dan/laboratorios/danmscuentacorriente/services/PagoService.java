package isi.dan.laboratorios.danmscuentacorriente.services;

import java.util.Optional;

import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;
import isi.dan.laboratorios.danmscuentacorriente.dtos.PagoDTO;

public interface PagoService {
    
    public Optional<Pago> buscarPago(Integer id);
    public Iterable<Pago> buscarPagos();

    public Pago guardarPago(PagoDTO pago);
    public Optional<Pago> actualizarPago(PagoDTO pago, Integer id);
    public void borrarPago(Integer id);

    public Iterable<Pago> buscarPagosPorCliente(Integer idCliente);
}
