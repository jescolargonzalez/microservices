package com.msvc.partes.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partes")
public class ParteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private String direccion;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private Double costo;

    @Column(name = "id_vehicle", nullable = false)
    private Long vehicleId;

    @Column(name = "id_user", nullable = false)
    private Long userId;
}