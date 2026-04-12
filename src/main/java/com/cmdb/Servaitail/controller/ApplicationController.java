package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.Application;
import com.cmdb.Servaitail.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/app")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping()
    public Application create(Application application){
        return applicationService.create(application);
    }

    @GetMapping
    public List<Application> getAll(){
        return applicationService.getAll();
    }
}
