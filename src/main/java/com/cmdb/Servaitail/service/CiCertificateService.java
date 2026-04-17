package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiCertificate;
import com.cmdb.Servaitail.repository.CiCertificateRepository;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiCertificateService {

    private final CiCertificateRepository ciCertificateRepository;
    private final CiRepository ciRepository;

    public CiCertificate create(UUID ciId, String domain, String issuer){

        Ci ci = ciRepository.findById(ciId).orElseThrow(() -> new RuntimeException("CI ID not found:" + ciId));

        CiCertificate ciCertificate = new CiCertificate();
        ciCertificate.setCi(ci);
        ciCertificate.setDomain(domain);
        ciCertificate.setIssuer(issuer);

        return ciCertificateRepository.save(ciCertificate);
    }

    public CiCertificate update(UUID id, CiCertificate req){

        CiCertificate certificate = ciCertificateRepository.findById(id).orElseThrow();

        certificate.setDomain(req.getDomain());
        certificate.setIssuer(req.getIssuer());
        certificate.setIs_ssl(req.getIs_ssl());
        certificate.setExpiry_date(req.getExpiry_date());
        certificate.setFingerprint(req.getFingerprint());

        return ciCertificateRepository.save(certificate);
    }

    public List<CiCertificate> getByCiId(UUID ciId){
        return ciCertificateRepository.findByCiId(ciId);
    }

    public void deleteCertficateById(UUID id){
        ciCertificateRepository.deleteById(id);
    }
}
