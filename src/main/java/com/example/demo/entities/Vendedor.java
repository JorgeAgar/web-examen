package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String documento;
    private String email;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
    private List<Compra> compras;
}
