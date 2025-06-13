package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "compra_id", nullable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "tipo_pago_id", nullable = false)
    private TipoPago tipoPago;

    @Enumerated(EnumType.STRING)
    private TarjetaTipo tarjetaTipo;

    private Double valor;
    private Integer cuotas;

    public enum TarjetaTipo {
        VISA, MASTERCARD
    }
}
