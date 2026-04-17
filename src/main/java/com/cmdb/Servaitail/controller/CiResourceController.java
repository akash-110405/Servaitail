package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.CiResource;
import com.cmdb.Servaitail.service.CiResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/resource")
@RequiredArgsConstructor
public class CiResourceController {

    private final CiResourceService ciResourceService;

    @PostMapping
    public CiResource create(@RequestBody Map<String,String> req){
        return ciResourceService.create(
                UUID.fromString(req.get("ciId")),
                Long.valueOf(req.get("memoryGb")),
                Long.valueOf(req.get("cpuCores")),
                Long.valueOf(req.get("storageGb"))
        );
    }

    @PutMapping("/{id}")
    public CiResource update(@PathVariable UUID id,
                             @RequestBody CiResource req){
        return ciResourceService.update(id,req);
    }

    @GetMapping("/{ciId}")
    public List<CiResource> getByCiId(@PathVariable UUID ciId){
        return ciResourceService.getByCIId(ciId);
    }

    @DeleteMapping("/{id}")
    public void deleteResourceById(@PathVariable UUID id){
        ciResourceService.deleteResourceById(id);
    }
}
