package com.example.demo.dto;

import com.example.demo.entities.Pago;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PagoDTO {
    private Integer compraId;
    private Integer tipoPagoId;
    private TipoPagoDTO tipoPago;
    private String tarjetaTipo;
    private Double valor;
    private Integer cuotas;

    public PagoDTO(Pago entity) {
        this.compraId = entity.getCompra() != null ? entity.getCompra().getId() : null;
        this.tipoPago = new TipoPagoDTO(entity.getTipoPago());
        this.tipoPagoId = entity.getTipoPago().getId();
        this.tarjetaTipo = entity.getTarjetaTipo() != null ? entity.getTarjetaTipo().name() : null;
        this.valor = entity.getValor() != null ? entity.getValor().doubleValue() : null;
        this.cuotas = entity.getCuotas();
    }
}
