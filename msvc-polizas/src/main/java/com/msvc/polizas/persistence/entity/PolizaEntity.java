package com.msvc.polizas.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "polizas")
public class PolizaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String numeroPoliza;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaFin;

    @Column(nullable = false)
    private Double monto;

    @Column(name = "vehicle_id", nullable = false)
    private Long vehicleId;
}