package com.example.demo.dto;

import com.example.demo.entities.TipoPago;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoPagoDTO {
    private String nombre;

    public TipoPagoDTO(TipoPago entity) {
        this.nombre = entity.getNombre();
    }
}
