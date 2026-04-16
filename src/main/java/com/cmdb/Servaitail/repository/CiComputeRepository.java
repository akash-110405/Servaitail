package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.CiCompute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CiComputeRepository extends JpaRepository<CiCompute, UUID> {
}
