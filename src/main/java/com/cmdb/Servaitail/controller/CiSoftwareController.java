package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.CiSoftware;
import com.cmdb.Servaitail.service.CiSoftwareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/software")
@RequiredArgsConstructor
public class CiSoftwareController {

    private final CiSoftwareService ciSoftwareService;

    @PostMapping
    public CiSoftware create(@RequestBody Map<String,String> req){
        return ciSoftwareService.create(
                UUID.fromString(req.get("ciId")),
                UUID.fromString(req.get("vendorId")),
                req.get("version")
        );
    }

    @GetMapping("/{ciId}")
    public List<CiSoftware> getByCiId(@PathVariable UUID ciId){
        return ciSoftwareService.getByCiId(ciId);
    }

    @GetMapping("/{vendorId}")
    public List<CiSoftware> getByVendorId(@PathVariable UUID vendorId){
        return ciSoftwareService.getByVendorId(vendorId);
    }
}