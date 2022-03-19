package com.smari.server.dao;

import com.smari.server.enitity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>, JpaSpecificationExecutor<Vendor> {
}