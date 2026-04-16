package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
