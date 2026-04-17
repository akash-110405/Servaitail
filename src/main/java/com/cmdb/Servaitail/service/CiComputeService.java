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

    public CiCompute update(UUID id,CiCompute req ){

        CiCompute compute = ciComputeRepository.findById(id).orElseThrow();

        compute.setHost_name(req.getHost_name());
        compute.setHost_ip(req.getHost_ip());
        compute.setLan_segment(req.getLan_segment());
        compute.setIs_virtual(req.getIs_virtual());
        compute.setDatacenter(req.getDatacenter());
        return ciComputeRepository.save(compute);
    }

    public List<CiCompute> getByCiId(UUID ciId){
        return ciComputeRepository.findByCiId(ciId);
    }

    public void deleteComputeById(UUID id){
        ciComputeRepository.deleteById(id);
    }
}
