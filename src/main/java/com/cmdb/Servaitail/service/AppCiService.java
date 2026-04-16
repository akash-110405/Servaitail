package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.AppCi;
import com.cmdb.Servaitail.entity.Application;
import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.repository.AppCiRepository;
import com.cmdb.Servaitail.repository.ApplicationRepository;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppCiService {

    private final AppCiRepository appCiRepository;
    private final ApplicationRepository applicationRepository;
    private final CiRepository ciRepository;

    public AppCi link(UUID appId, UUID ciId){

        Application application = applicationRepository.findById(appId).orElseThrow();
        Ci ci = ciRepository.findById(ciId).orElseThrow();

        AppCi appCi = new AppCi();
        appCi.setApplication(application);
        appCi.setCi(ci);

        return appCiRepository.save(appCi);
    }

}
