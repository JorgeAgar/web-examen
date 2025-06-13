package com.example.demo.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CajeroDTO;
import com.example.demo.dto.ClienteDTO;
import com.example.demo.dto.FacturaDTO;
import com.example.demo.dto.PagoDTO;
import com.example.demo.dto.ProductoDTO;
import com.example.demo.dto.VendedorDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Compra;
import com.example.demo.entities.DetallesCompra;
import com.example.demo.entities.Pago;
import com.example.demo.entities.Producto;
import com.example.demo.entities.Tienda;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class FacturaService {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PagoService pagoService;
	
	@Autowired
	private TiendaService tiendaService;

	public FacturaDTO generarFactura(int tiendaId, FacturaDTO factura) {
		Tienda tienda = tiendaService.getTiendaById(tiendaId);
		Cliente cliente = clienteService.getClienteByDoc(factura.getCliente().getDocumento());
		List<DetallesCompra> detalles = new LinkedList<DetallesCompra>();
		
		return new FacturaDTO();
	}
}
