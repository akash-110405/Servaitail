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
@Table(name = "ci_software")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CiSoftware {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Ci ci;
    private Vendor vendor;
    private String version;
    private Long license_type_id;
    private LocalDate license_expiry;
    private LocalDate support_expiry;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}