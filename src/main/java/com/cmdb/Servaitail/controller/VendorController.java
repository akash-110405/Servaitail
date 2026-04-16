package com.cmdb.Servaitail.controller;

import com.cmdb.Servaitail.entity.Vendor;
import com.cmdb.Servaitail.service.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/vendor")
@RequiredArgsConstructor
public class VendorController {

    private final VendorService vendorService;

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor){
        return vendorService.createVendor(vendor);
    }

    @GetMapping
    public List<Vendor> getAll(){
        return vendorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Vendor> getVendorById(@PathVariable UUID id){
        return vendorService.getVendorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVendorById(@PathVariable UUID id){
        vendorService.deleteVendorById(id);
    }
}
