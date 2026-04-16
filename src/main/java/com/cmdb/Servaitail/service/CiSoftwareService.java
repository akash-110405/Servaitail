package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Ci;
import com.cmdb.Servaitail.entity.CiSoftware;
import com.cmdb.Servaitail.entity.Vendor;
import com.cmdb.Servaitail.repository.CiRepository;
import com.cmdb.Servaitail.repository.CiSoftwareRepository;
import com.cmdb.Servaitail.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CiSoftwareService {

    private final CiSoftwareRepository ciSoftwareRepository;
    private final CiRepository ciRepository;
    private final VendorRepository vendorRepository;

    public CiSoftware create(UUID ciId, UUID vendorId, String version){

        Ci ci = ciRepository.findById(ciId).orElseThrow();
        Vendor vendor = vendorRepository.findById(vendorId).orElseThrow();

        CiSoftware ciSoftware = new CiSoftware();
        ciSoftware.setCi(ci);
        ciSoftware.setVendor(vendor);
        ciSoftware.setVersion(version);

        return ciSoftwareRepository.save(ciSoftware);
    }

    public List<CiSoftware> getByCiId(UUID ciId){
        return ciSoftwareRepository.findByCiId(ciId);
    }

    public List<CiSoftware> getByVendorId(UUID vendorId){
        return ciSoftwareRepository.findByVendorId(vendorId);
    }
}
