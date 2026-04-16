package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiCompute;
import com.cmdb.Servaitail.repository.CiComputeRepository;
import com.cmdb.Servaitail.repository.CiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiComputeService {

    private final CiComputeRepository ciComputeRepository;
    private final CiRepository ciRepository;

    public CiCompute create(UUID ciId, String hostName, String hostIp, String dataCenter){

        Ci ci = ciRepository.findById(ciId).orElseThrow();

        CiCompute ciCompute = new CiCompute();
        ciCompute.setCi(ci);
        ciCompute.setHost_name(hostName);
        ciCompute.setHost_ip(hostIp);
        ciCompute.setDatacenter(dataCenter);

        return ciComputeRepository.save(ciCompute);
    }

    public List<CiCompute> getByCiId(UUID ciId){
        return ciComputeRepository.findByCiId(ciId);
    }
}
