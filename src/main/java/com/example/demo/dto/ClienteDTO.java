package com.example.demo.dto;

import com.example.demo.entities.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDTO {
    private String nombre;
    private String documento;
    private Integer tipoDocumentoId;

    public ClienteDTO(Cliente entity) {
        this.nombre = entity.getNombre();
        this.documento = entity.getDocumento();
        this.tipoDocumentoId = entity.getTipoDocumento() != null ? entity.getTipoDocumento().getId() : null;
    }
}

