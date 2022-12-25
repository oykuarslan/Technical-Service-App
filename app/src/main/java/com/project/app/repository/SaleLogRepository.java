package com.project.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.app.model.SaleLog;

public interface SaleLogRepository extends JpaRepository<SaleLog, Long> {


}
