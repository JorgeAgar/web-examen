package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String documento;
    private String email;
    private String token;

    @ManyToOne
    @JoinColumn(name = "tienda_id", nullable = false)
    private Tienda tienda;

    @OneToMany(mappedBy = "cajero", cascade = CascadeType.ALL)
    private List<Compra> compras;
}
