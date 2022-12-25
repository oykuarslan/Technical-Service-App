package com.project.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.model.SaleLog;
import com.project.app.service.SaleLogService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("SaleLog")
@AllArgsConstructor
public class SaleLogController {
	private SaleLogService saleLogService; 
	
	@PostMapping("/save")
		public ResponseEntity<SaleLog> createSale(@RequestBody SaleLog saleLog){
			return ResponseEntity.status(HttpStatus.CREATED).body(saleLogService.create(saleLog));
	}
	
	
}
