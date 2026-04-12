package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "app")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String name;
    private String owner;
    private Long criticality_id;
    private Long env_id;
    private String team;
    private String description;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}
