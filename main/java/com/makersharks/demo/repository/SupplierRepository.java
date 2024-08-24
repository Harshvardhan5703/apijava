package com.makersharks.demo.repository;

import com.makersharks.demo.model.Supplier;
import com.makersharks.demo.model.NatureOfBusiness;
import com.makersharks.demo.model.ManufacturingProcess;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location,
            NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess,
            Pageable pageable);
}
