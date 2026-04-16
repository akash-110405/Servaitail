package com.cmdb.Servaitail.service;

import com.cmdb.Servaitail.entity.Vendor;
import com.cmdb.Servaitail.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
