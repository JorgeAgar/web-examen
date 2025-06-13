package com.example.demo.dto;

import com.example.demo.entities.Tienda;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TiendaDTO {
    private String nombre;
    private String direccion;
    private String uuid;

    public TiendaDTO(Tienda entity) {
        this.nombre = entity.getNombre();
        this.direccion = entity.getDireccion();
        this.uuid = entity.getUuid();
    }
}
