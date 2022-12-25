package com.project.app.service.impl;

import org.springframework.stereotype.Service;

import com.project.app.repository.ServiceRepository;
import com.project.app.service.ServiceManager;

import lombok.AllArgsConstructor;

@Service
public class ServiceManagerImpl implements ServiceManager {
	
	private ServiceRepository serviceRepository;
	
	public ServiceManagerImpl(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}

	public com.project.app.model.Service findById(Long id)
	{
		return serviceRepository.findById(id).get();
	}




}
