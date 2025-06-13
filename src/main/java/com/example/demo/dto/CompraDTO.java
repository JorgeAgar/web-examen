package com.example.demo.dto;

import com.example.demo.entities.Compra;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CompraDTO {
    private Integer clienteId;
    private Integer tiendaId;
    private Integer vendedorId;
    private Integer cajeroId;
    private Double total;
    private Double impuestos;
    private LocalDateTime fecha;
    private String observaciones;

    public CompraDTO(Compra entity) {
        this.clienteId = entity.getCliente() != null ? entity.getCliente().getId() : null;
        this.tiendaId = entity.getTienda() != null ? entity.getTienda().getId() : null;
        this.vendedorId = entity.getVendedor() != null ? entity.getVendedor().getId() : null;
        this.cajeroId = entity.getCajero() != null ? entity.getCajero().getId() : null;
        this.total = entity.getTotal() != null ? entity.getTotal().doubleValue() : null;
        this.impuestos = entity.getImpuestos() != null ? entity.getImpuestos().doubleValue() : null;
        this.fecha = entity.getFecha();
        this.observaciones = entity.getObservaciones();
    }
}
