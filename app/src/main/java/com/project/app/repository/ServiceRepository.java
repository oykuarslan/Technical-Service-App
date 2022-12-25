package com.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

	

}
