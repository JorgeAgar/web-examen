package com.example.demo.dto;

import com.example.demo.entities.Producto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoDTO {
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;
    private String referencia;
    private Integer tipoProductoId;

    public ProductoDTO(Producto entity) {
        this.nombre = entity.getNombre();
        this.descripcion = entity.getDescripcion();
        this.precio = entity.getPrecio() != null ? entity.getPrecio().doubleValue() : null;
        this.cantidad = entity.getCantidad();
        this.referencia = entity.getReferencia();
        this.tipoProductoId = entity.getTipoProducto() != null ? entity.getTipoProducto().getId() : null;
    }
}
