package com.example.demo.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FacturaDTO {

	private int impuesto;
	private ClienteDTO cliente;
	private List<ProductoDTO> productos;
	private List<PagoDTO> medios_pago;
	private VendedorDTO vendedor;
	private CajeroDTO cajero;
}
