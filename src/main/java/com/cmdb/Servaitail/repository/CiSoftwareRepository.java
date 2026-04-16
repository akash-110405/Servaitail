package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.CiSoftware;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CiSoftwareRepository extends JpaRepository<CiSoftware, UUID> {

    List<CiSoftware> findByCiId(UUID ciId);

    List<CiSoftware> findByVendorId(UUID vendorId);
}
