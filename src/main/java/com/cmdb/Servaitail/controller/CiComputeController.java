package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.CiCompute;
import com.cmdb.Servaitail.service.CiComputeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/compute")
@RequiredArgsConstructor
public class CiComputeController {

    private final CiComputeService ciComputeService;

    @PostMapping
    public CiCompute create(@RequestBody Map<String,String> req){
        return ciComputeService.create(
                UUID.fromString(req.get("ciId")),
                String.format(req.get("hostName")),
                String.format(req.get("hostIp")),
                String.format(req.get("dataCenter"))
        );
    }

    @GetMapping
    public List<CiCompute> getByCiId(UUID ciId){
        return ciComputeService.getByCiId(ciId);
    }
}
