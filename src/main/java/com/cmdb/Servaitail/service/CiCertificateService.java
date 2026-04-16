package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiCertificate;
import com.cmdb.Servaitail.repository.CiCertificateRepository;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiCertificateService {

    private CiCertificateRepository ciCertificateRepository;
    private CiRepository ciRepository;

    public CiCertificate create(UUID ciId, String domain, String issuer){

        Ci ci = ciRepository.findById(ciId).orElseThrow();

        CiCertificate ciCertificate = new CiCertificate();
        ciCertificate.setCi(ci);
        ciCertificate.setDomain(domain);
        ciCertificate.setIssuer(issuer);

        return ciCertificateRepository.save(ciCertificate);
    }

    public List<CiCertificate> getByCiId(UUID ciId){
        return ciCertificateRepository.findByCiId(ciId);
    }
}
