package com.smari.server.dao;

import com.smari.server.enitity.VendorProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VendorPropertyRepository extends JpaRepository<VendorProperty, Integer>, JpaSpecificationExecutor<VendorProperty> {
}