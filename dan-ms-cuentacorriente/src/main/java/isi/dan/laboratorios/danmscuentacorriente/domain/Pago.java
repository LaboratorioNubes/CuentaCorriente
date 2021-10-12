package isi.dan.laboratorios.danmscuentacorriente.domain;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	private Cliente cliente;

	private Date fechaPago;

	@OneToOne
	private MedioPago medio;

	public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	public Date getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

	public MedioPago getMedio() {
        return medio;
    }
    public void setMedio(MedioPago medio) {
        this.medio = medio;
    }
}