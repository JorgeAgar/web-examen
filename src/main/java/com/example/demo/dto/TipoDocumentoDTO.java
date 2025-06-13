package com.example.demo.dto;

import com.example.demo.entities.TipoDocumento;

public class TipoDocumentoDTO {
    private String nombre;

    public TipoDocumentoDTO(TipoDocumento entity) {
        this.nombre = entity.getNombre();
    }

    // Getters y setters opcionales
}
