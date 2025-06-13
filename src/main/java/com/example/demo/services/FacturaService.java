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

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class FacturaService {
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PagoService pagoService;

	public FacturaDTO generarFactura(int clienteId) {
		Cliente cliente = clienteService.getClienteById(clienteId);
		Compra compra = cliente.getCompras().get(0);
		List<ProductoDTO> productos = new LinkedList<ProductoDTO>();
		for(DetallesCompra d : compra.getDetallesCompra()) {
			productos.add(new ProductoDTO(d.getProducto()));
		}
		List<Pago> pagos = pagoService.getPagosByCompra(compra.getId());
		List<PagoDTO> pagosDTO = new LinkedList<PagoDTO>();
		for(Pago p : pagos) {
			pagosDTO.add(new PagoDTO(p));
		}
		
		FacturaDTO factura = new FacturaDTO();
		factura.setCajero(new CajeroDTO(compra.getCajero()));
		factura.setCliente(new ClienteDTO(cliente));
		factura.setImpuesto(compra.getImpuestos());
		factura.setMedios_pago(pagosDTO);
		factura.setProductos(productos);
		factura.setVendedor(new VendedorDTO(compra.getVendedor()));
		return factura;
	}
}
