package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.Ci;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CiRepository extends JpaRepository<Ci, UUID> {

    Optional<Ci> findById(UUID id);
}
