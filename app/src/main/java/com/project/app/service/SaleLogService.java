package com.project.app.service;

import org.springframework.stereotype.Service;

import com.project.app.model.SaleLog;

@Service
public interface SaleLogService {
	SaleLog create(SaleLog saleLog);

}
