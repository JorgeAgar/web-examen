package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tienda_id", nullable = false)
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "cajero_id", nullable = false)
    private Cajero cajero;

    private Double total;
    private Double impuestos;

    private LocalDateTime fecha;

    private String observaciones;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<DetallesCompra> detallesCompra;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<Pago> pagos;
}

