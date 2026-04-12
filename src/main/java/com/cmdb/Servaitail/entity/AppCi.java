package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "app_ci")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppCi {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Application application;
    private Ci ci;
    private Long role_id;
    private String notes;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}
