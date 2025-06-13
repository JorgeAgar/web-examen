package com.example.demo.dto;

import com.example.demo.entities.DetallesCompra;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DetallesCompraDTO {
    private Integer compraId;
    private Integer productoId;
    private Integer cantidad;
    private Double precio;
    private Double descuento;

    public DetallesCompraDTO(DetallesCompra entity) {
        this.compraId = entity.getCompra() != null ? entity.getCompra().getId() : null;
        this.productoId = entity.getProducto() != null ? entity.getProducto().getId() : null;
        this.cantidad = entity.getCantidad();
        this.precio = entity.getPrecio() != null ? entity.getPrecio().doubleValue() : null;
        this.descuento = entity.getDescuento() != null ? entity.getDescuento().doubleValue() : null;
    }
}
