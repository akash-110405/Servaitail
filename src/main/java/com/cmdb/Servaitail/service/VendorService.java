package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Vendor;
import com.cmdb.Servaitail.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VendorService {

    private final VendorRepository vendorRepository;

    public Vendor createVendor(Vendor vendor){
        return vendorRepository.save(vendor);
    }

    public Vendor updateVendor(UUID id,Vendor req){

        Vendor vendor = vendorRepository.findById(id).orElseThrow();

        vendor.setName(req.getName());
        vendor.setWebsite(req.getWebsite());
        vendor.setSupport_mail(req.getSupport_mail());
        vendor.setSupport_phone(req.getSupport_phone());
        vendor.setNotes(req.getNotes());
        vendor.setModified_on(LocalDateTime.now());

        return vendorRepository.save(vendor);
    }

    public List<Vendor> getAll(){
        return vendorRepository.findAll();
    }

    public Optional<Vendor> getVendorById(UUID id){
        return vendorRepository.findById(id);
    }

    public void deleteVendorById(UUID id){
        vendorRepository.deleteById(id);
    }
}
