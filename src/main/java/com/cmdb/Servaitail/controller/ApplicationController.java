package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.Application;
import com.cmdb.Servaitail.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/app")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping()
    public Application create(@RequestBody Application application){
        return applicationService.create(application);
    }

    @PutMapping("/{id}")
    public Application update(@PathVariable UUID id,
                              @RequestBody Application application){
        return applicationService.update(id,application);
    }

    @GetMapping()
    public List<Application> getAll(){
        return applicationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Application> getAppById(@PathVariable UUID id){
        return applicationService.getAppById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppById(@PathVariable UUID id){
        applicationService.deleteAppById(id);
    }
}
