package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ci_certificate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CiCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ci_id")
    private Ci ci;

    private String domain;
    private String issuer;
    private Boolean is_ssl;
    private LocalDate expiry_date;
    private String fingerprint;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}
