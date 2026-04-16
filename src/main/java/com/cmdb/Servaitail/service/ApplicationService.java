package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Application;
import com.cmdb.Servaitail.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
