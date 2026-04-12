package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ci")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ci {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private Long deploy_type_id;
    private Long category_id;
    private Long sub_category_id;
    private Long env_id;
    private Long status_id;
    private String owner;
    private String region;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;
}
