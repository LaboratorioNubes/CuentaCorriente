package isi.dan.laboratorios.danmscuentacorriente.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class MedioPagoDTO {
    private Integer id;
    private String observacion;
}