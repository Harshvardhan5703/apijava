package com.makersharks.demo.service;

import com.makersharks.demo.model.ManufacturingProcess;
import com.makersharks.demo.model.NatureOfBusiness;
import com.makersharks.demo.model.Supplier;
import com.makersharks.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness,
                                          ManufacturingProcess manufacturingProcess, int page, int size) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcess, PageRequest.of(page, size));
    }
}
