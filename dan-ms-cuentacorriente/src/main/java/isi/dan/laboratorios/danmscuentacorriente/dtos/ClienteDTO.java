package isi.dan.laboratorios.danmscuentacorriente.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private Integer id;
    private String razonSocial;
    private String cuit;
    private String mail;
}
