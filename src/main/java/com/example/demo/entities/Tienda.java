package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String direccion;
    private String uuid;

    @OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<Cajero> cajeros;

    @OneToMany(mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<Compra> compras;
}

