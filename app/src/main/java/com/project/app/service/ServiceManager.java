package com.project.app.service;
import org.springframework.stereotype.Service;

import com.project.app.repository.ServiceRepository;

@Service
public interface ServiceManager
{
	com.project.app.model.Service findById(Long id);
	
}