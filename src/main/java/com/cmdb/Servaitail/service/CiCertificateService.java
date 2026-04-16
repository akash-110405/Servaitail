package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiCertificate;
import com.cmdb.Servaitail.repository.CiCertificateRepository;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiCertificateService {

    private CiCertificateRepository ciCertificateRepository;
    private CiRepository ciRepository;


}
