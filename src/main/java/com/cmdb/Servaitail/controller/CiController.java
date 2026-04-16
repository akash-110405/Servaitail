package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.service.CiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/ci")
@RequiredArgsConstructor
public class CiController {

    private final CiService ciService;

    @PostMapping
    public Ci craeteCi(@RequestBody Ci ci){
        return ciService.CreateCi(ci);
    }

    @GetMapping
    public List<Ci> getAll(){
        return ciService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Ci> getCiById(@PathVariable UUID id){
        return ciService.getCiById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCiById(@PathVariable UUID id){
        ciService.deleteCiById(id);
    }
}
