package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PagoDTO;
import com.example.demo.entities.Compra;
import com.example.demo.entities.Pago;
import com.example.demo.entities.Pago.TarjetaTipo;
import com.example.demo.entities.TipoPago;
import com.example.demo.repositories.PagoRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    @Autowired
    private CompraService compraService;

    @Autowired
    private TipoPagoService tipoPagoService;

    public List<Pago> getAllPagos() {
        return pagoRepository.findAll();
    }

    public Pago getPagoById(int id) {
        return pagoRepository.getReferenceById(id);
    }

    public void addPago(PagoDTO dto) {
        Pago pago = new Pago();
        Compra compra = compraService.getCompraById(dto.getCompraId());
        TipoPago tipoPago = tipoPagoService.getTipoPagoById(dto.getTipoPagoId());

        pago.setCompra(compra);
        pago.setTipoPago(tipoPago);
        pago.setTarjetaTipo(dto.getTarjetaTipo() != null ? TarjetaTipo.valueOf(dto.getTarjetaTipo()) : null);
        pago.setValor(dto.getValor());
        pago.setCuotas(dto.getCuotas());

        pagoRepository.save(pago);
    }
}
