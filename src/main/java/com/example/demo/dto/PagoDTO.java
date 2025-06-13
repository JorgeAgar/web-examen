package com.example.demo.dto;

import com.example.demo.entities.Pago;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PagoDTO {
    private Integer compraId;
    private Integer tipoPagoId;
    private String tarjetaTipo;
    private Double valor;
    private Integer cuotas;

    public PagoDTO(Pago entity) {
        this.compraId = entity.getCompra() != null ? entity.getCompra().getId() : null;
        this.tipoPagoId = entity.getTipoPago() != null ? entity.getTipoPago().getId() : null;
        this.tarjetaTipo = entity.getTarjetaTipo() != null ? entity.getTarjetaTipo().name() : null;
        this.valor = entity.getValor() != null ? entity.getValor().doubleValue() : null;
        this.cuotas = entity.getCuotas();
    }
}
