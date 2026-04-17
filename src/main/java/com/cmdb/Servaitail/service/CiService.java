package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiService {

    private final CiRepository ciRepository;

    public Ci CreateCi(Ci ci){
        return ciRepository.save(ci);
    }

    public Ci UpdateCi(UUID id, Ci req){

        Ci ci = ciRepository.findById(id).orElseThrow();

        ci.setName(req.getName());
        ci.setOwner(req.getOwner());
        ci.setRegion(req.getRegion());
        ci.setCategory_id(req.getCategory_id());
        ci.setSub_category_id(req.getSub_category_id());
        ci.setStatus_id(req.getStatus_id());
        ci.setEnv_id(req.getEnv_id());
        ci.setDeploy_type_id(req.getDeploy_type_id());
        ci.setModified_on(LocalDateTime.now());

        return ciRepository.save(ci);
    }

    public List<Ci> getAll(){
        return ciRepository.findAll();
    }

    public Optional<Ci> getCiById(UUID id){
        return ciRepository.findById(id);
    }

    public void deleteCiById(UUID id){
        ciRepository.deleteById(id);
    }
}
