package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiResource;
import com.cmdb.Servaitail.repository.CiRepository;
import com.cmdb.Servaitail.repository.CiResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public CiResource update(UUID id,CiResource req ){

        CiResource r = ciResourceRepository.findById(id).orElseThrow();

        r.setMemory_gb(req.getMemory_gb());
        r.setCpu_cores(req.getCpu_cores());
        r.setStorage_gb(req.getStorage_gb());
        r.setStorage_used_gb(req.getStorage_used_gb());
        r.setModified_on(LocalDateTime.now());

        return ciResourceRepository.save(r);
    }

    public List<CiResource> getByCIId(UUID ciId) {
        return ciResourceRepository.findByCiId(ciId);
    }

    public void deleteResourceById(UUID id){
        ciResourceRepository.deleteById(id);
    }
}
