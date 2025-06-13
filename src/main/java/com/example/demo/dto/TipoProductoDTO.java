package com.example.demo.dto;

import com.example.demo.entities.TipoProducto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoProductoDTO {
    private String nombre;

    public TipoProductoDTO(TipoProducto entity) {
        this.nombre = entity.getNombre();
    }
}
