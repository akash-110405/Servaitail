package com.cmdb.Servaitail.repository;

import com.cmdb.Servaitail.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplicationRepository extends JpaRepository<Application, UUID> {
}
