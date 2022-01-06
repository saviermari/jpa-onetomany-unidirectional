package com.smari.server.dao;

import com.smari.server.enitity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author smari
 */
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
