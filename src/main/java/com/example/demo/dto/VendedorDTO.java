package com.example.demo.dto;

import com.example.demo.entities.Vendedor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendedorDTO {
    private String nombre;
    private String documento;
    private String email;

    public VendedorDTO(Vendedor entity) {
        this.nombre = entity.getNombre();
        this.documento = entity.getDocumento();
        this.email = entity.getEmail();
    }
}
