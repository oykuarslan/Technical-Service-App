package com.project.app.service.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.project.app.model.SaleLog;
import com.project.app.repository.SaleLogRepository;
import com.project.app.repository.SaleRepository;
import com.project.app.service.SaleLogService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SaleLogServiceImpl implements SaleLogService {

	private SaleLogRepository saleLogRepository;
	private SaleRepository saleRepository;
	private EntityManager entitymanager;
	
	public SaleLog create(SaleLog saleLog){
		
		saleLog = saleLogRepository.save(saleLog);
		saleLogRepository.flush();
		entitymanager.clear();
		saleLog = saleLogRepository.findById(saleLog.getId()).get();
		saleLog.getSale().setSold(true);
		saleRepository.save(saleLog.getSale());		
		return saleLog;
		
	}
	

}
