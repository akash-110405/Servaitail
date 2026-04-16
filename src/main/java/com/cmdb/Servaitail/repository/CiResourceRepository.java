package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.CiResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CiResourceRepository extends JpaRepository<CiResource, UUID> {

    List<CiResource> findByCiId(UUID ciId);
}
