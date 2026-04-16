package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiResource;
import com.cmdb.Servaitail.repository.CiRepository;
import com.cmdb.Servaitail.repository.CiResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiResourceService {

    private final CiResourceRepository ciResourceRepository;
    private final CiRepository ciRepository;

    public CiResource create(UUID ciId, Long memoryGb, Long cpuCores, Long storageGb){

        Ci ci = ciRepository.findById(ciId).orElseThrow();

        CiResource ciResource = new CiResource();
        ciResource.setCi(ci);
        ciResource.setMemory_gb(memoryGb);
        ciResource.setCpu_cores(cpuCores);
        ciResource.setStorage_gb(storageGb);

        return ciResourceRepository.save(ciResource);
    }

    public List<CiResource> getByCIId(UUID ciId) {
        return ciResourceRepository.findByCiId(ciId);
    }
}
