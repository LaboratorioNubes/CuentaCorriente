package isi.dan.laboratorios.danmscuentacorriente.services.impl;

import isi.dan.laboratorios.danmscuentacorriente.domain.Cliente;
import isi.dan.laboratorios.danmscuentacorriente.dtos.ClienteDTO;
import isi.dan.laboratorios.danmscuentacorriente.exceptions.DataNotFoundException;
import isi.dan.laboratorios.danmscuentacorriente.repositories.ClienteRepository;
import isi.dan.laboratorios.danmscuentacorriente.services.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ClienteDTO findById(int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if(!cliente.isPresent()){
            throw new DataNotFoundException("El cliente con id: " + id + " no existe");
        }

        return modelMapper.map(cliente.get(), ClienteDTO.class);
    }
}
