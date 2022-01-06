package com.smari.server.dao;

import com.smari.server.enitity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author smari
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
