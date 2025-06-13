package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;
    private String referencia;

    @ManyToOne
    @JoinColumn(name = "tipo_producto_id", nullable = false)
    private TipoProducto tipoProducto;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetallesCompra> detallesCompra;
}
