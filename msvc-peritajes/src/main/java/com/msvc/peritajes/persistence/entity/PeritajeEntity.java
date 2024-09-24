package com.msvc.peritajes.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "peritajes")
public class PeritajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_peritaje")
    private int idPeritaje;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_peritaje", nullable = false)
    private Date fechaPeritaje;

    @Column(nullable = false)
    private String informe;

    @Column(name = "coste_estimado", nullable = false)
    private Long costeEstimado;

    @Column(name = "id_parte", nullable = false)
    private int idParte;
}
