package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.CiCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CiCertificateRepository extends JpaRepository<CiCertificate, UUID> {
}
