package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ci_resource")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CiResource {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ci_id")
    private Ci ci;

    private Long memory_gb;
    private Long cpu_cores;
    private Long storage_gb;
    private Long storage_used_gb;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}
