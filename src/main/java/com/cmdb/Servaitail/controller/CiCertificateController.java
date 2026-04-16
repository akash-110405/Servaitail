package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.CiCertificate;
import com.cmdb.Servaitail.service.CiCertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/certificate")
@RequiredArgsConstructor
public class CiCertificateController {

    private final CiCertificateService ciCertificateService;

    @PostMapping
    public CiCertificate create(@RequestBody Map<String,String> req){
        return ciCertificateService.create(
                UUID.fromString(req.get("ciId")),
                String.format(req.get("domain")),
                String.format(req.get("issuer"))
        );
    }

    @GetMapping
    public List<CiCertificate> getByCiId(@PathVariable UUID ciId){
        return ciCertificateService.getByCiId(ciId);
    }
}
