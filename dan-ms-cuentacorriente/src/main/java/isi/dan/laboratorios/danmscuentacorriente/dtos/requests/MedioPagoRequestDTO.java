package isi.dan.laboratorios.danmscuentacorriente.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class MedioPagoRequestDTO {
    private String descripcion;
}
