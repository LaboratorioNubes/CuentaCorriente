package isi.dan.laboratorios.danmscuentacorriente.services;

import java.util.List;
import java.util.Optional;

import isi.dan.laboratorios.danmscuentacorriente.domain.Pago;
import isi.dan.laboratorios.danmscuentacorriente.dtos.PagoDTO;
import isi.dan.laboratorios.danmscuentacorriente.dtos.requests.PagoRequestDTO;
import isi.dan.laboratorios.danmscuentacorriente.dtos.response.PagoClienteResponseDTO;

public interface PagoService {
    
    Optional<Pago> buscarPago(Integer id);
    Iterable<Pago> buscarPagos();

    void guardarPago(PagoRequestDTO pago);
    Optional<Pago> actualizarPago(PagoDTO pago, Integer id);
    void borrarPago(Integer id);

    List<PagoClienteResponseDTO> buscarPagosPorCliente(Integer idCliente);
}
