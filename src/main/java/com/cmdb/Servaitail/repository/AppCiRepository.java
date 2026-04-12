package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.AppCi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppCiRepository extends JpaRepository<AppCi, UUID> {
}
