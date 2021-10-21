package isi.dan.laboratorios.danmscuentacorriente.services.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import isi.dan.laboratorios.danmscuentacorriente.domain.*;
import isi.dan.laboratorios.danmscuentacorriente.dtos.requests.PagoRequestDTO;
import isi.dan.laboratorios.danmscuentacorriente.dtos.response.PagoClienteResponseDTO;
import isi.dan.laboratorios.danmscuentacorriente.repositories.MedioPagoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import isi.dan.laboratorios.danmscuentacorriente.dtos.PagoDTO;
import isi.dan.laboratorios.danmscuentacorriente.repositories.PagoRepository;
import isi.dan.laboratorios.danmscuentacorriente.services.PagoService;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    PagoRepository pagoRepo;

    @Autowired
    MedioPagoRepository medioPagoRepository;

    @Autowired
    ClienteServiceImpl clienteService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Optional<Pago> buscarPago(Integer id) {
        return this.pagoRepo.findById(id);
    }

    @Override
    public Iterable<Pago> buscarPagos() {
        return this.pagoRepo.findAll();
    }

    @Override
    public void guardarPago(PagoRequestDTO pagoDTO) {

        Cliente cliente = modelMapper.map(clienteService.findById(pagoDTO.getCliente()), Cliente.class);

        Pago pagoNuevo = new Pago();
        pagoNuevo.setCliente(cliente);
        pagoNuevo.setFechaPago(pagoDTO.getFechaPago());
        pagoNuevo.setMonto(pagoDTO.getMonto());

        if(pagoDTO.getCheque() != null){
            Cheque cheque = new Cheque();
            cheque.setNroCheque(pagoDTO.getCheque().getNroCheque());
            cheque.setFechaCobro(pagoDTO.getCheque().getFechaCobro());
            cheque.setBanco(pagoDTO.getCheque().getBanco());

            medioPagoRepository.save(cheque);
            pagoNuevo.setMedio(cheque);
        }else if(pagoDTO.getEfectivo() != null){
            Efectivo efectivo = new Efectivo();
            efectivo.setNroRecibo(pagoDTO.getEfectivo().getNroRecibo());

            medioPagoRepository.save(efectivo);
            pagoNuevo.setMedio(efectivo);
        }else if(pagoDTO.getTransferencia() != null){
            Transferencia transferencia = new Transferencia();
            transferencia.setCodigoTransferencia(pagoDTO.getTransferencia().getCodigoTransferencia());
            transferencia.setCbuDestino(pagoDTO.getTransferencia().getCbuDestino());
            transferencia.setCbuOrigen(pagoDTO.getTransferencia().getCbuOrigen());

            medioPagoRepository.save(transferencia);
            pagoNuevo.setMedio(transferencia);
        }

        pagoRepo.save(pagoNuevo);
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
    public List<PagoClienteResponseDTO> buscarPagosPorCliente(Integer idCliente) {

        List<Pago> list = pagoRepo.findByCliente(idCliente);
        List<PagoClienteResponseDTO> resultado =  new ArrayList<>();

        for(Pago p: list){
            PagoClienteResponseDTO aux = new PagoClienteResponseDTO();
            aux.setFechaPago(p.getFechaPago());
            aux.setMonto(p.getMonto());

            resultado.add(aux);
        }

        return resultado;
    }
    
}
