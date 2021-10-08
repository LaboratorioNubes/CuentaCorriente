package isi.dan.laboratorios.danmscuentacorriente.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EfectivoDTO extends MedioPagoDTO{
    private Integer nroRecibo;
}
