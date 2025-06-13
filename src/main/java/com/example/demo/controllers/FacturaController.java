package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.services.FacturaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/")
public class FacturaController {
	
	@Autowired
	FacturaService facturaService;

	@GetMapping("/crear/{idTienda}")
	public FacturaDTO procesarFactura(@PathVariable String idTienda, @RequestBody FacturaDTO factura) {
		return facturaService.generarFactura(idTienda, factura);
	}
}
