package com.example.demo.dto;

import com.example.demo.entities.Cajero;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CajeroDTO {
    private String nombre;
    private String documento;
    private String email;
    private String token;
    private Integer tiendaId;

    public CajeroDTO(Cajero entity) {
        this.nombre = entity.getNombre();
        this.documento = entity.getDocumento();
        this.email = entity.getEmail();
        this.token = entity.getToken();
        this.tiendaId = entity.getTienda() != null ? entity.getTienda().getId() : null;
    }
}

