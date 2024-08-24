package com.makersharks.demo.controller;

import com.makersharks.demo.model.ManufacturingProcess;
import com.makersharks.demo.model.NatureOfBusiness;
import com.makersharks.demo.model.Supplier;
import com.makersharks.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> searchSuppliers(@RequestParam String location,
                                                          @RequestParam NatureOfBusiness natureOfBusiness,
                                                          @RequestParam ManufacturingProcess manufacturingProcess,
                                                          @RequestParam(defaultValue = "0") @Min(0) int page,
                                                          @RequestParam(defaultValue = "10") @Min(1) int size) {
        Page<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
        return ResponseEntity.ok(suppliers);
    }
}
