package com.cmdb.Servaitail.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ci_compute")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CiCompute {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Ci ci;
    private String host_name;
    private String host_ip;
    private String lan_segment;
    private Boolean is_virtual;
    private UUID vm_group_id;
    private String datacenter;
    private LocalDateTime created_on;
    private String created_by;
    private String modified_by;
    private LocalDateTime modified_on;

}
