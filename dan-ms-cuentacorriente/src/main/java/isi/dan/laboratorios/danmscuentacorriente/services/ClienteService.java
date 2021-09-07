package isi.dan.laboratorios.danmscuentacorriente.services;

import isi.dan.laboratorios.danmscuentacorriente.dtos.ClienteDTO;

public interface ClienteService {
    ClienteDTO findById(int id);
}
