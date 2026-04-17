package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Application;
import com.cmdb.Servaitail.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public Application create(Application app){
        return applicationRepository.save(app);
    }

    public Application update(UUID id, Application application){

        Application app  = applicationRepository.findById(id).orElseThrow();

        app.setName(application.getName());
        app.setOwner(application.getOwner());
        app.setTeam(application.getTeam());
        app.setDescription(application.getDescription());
        app.setCriticality_id(application.getCriticality_id());
        app.setEnv_id(application.getEnv_id());
        app.setModified_on(LocalDateTime.now());
        return applicationRepository.save(app);
    }

    public List<Application> getAll(){
        return applicationRepository.findAll();
    }

    public Optional<Application> getAppById(UUID id){
        return applicationRepository.findById(id);
    }

    public void deleteAppById(UUID id){
        applicationRepository.deleteById(id);
    }
}
