package com.project.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.app.model.Booking;
import com.project.app.model.Sale;
import com.project.app.model.DTO.SaleStatusRequestDTO;

@Service
public interface SaleService {

	Sale createSale(Sale sale);
	List<Sale> getAllSales();
	void deleteSale(long id);
	List<Sale> getByProduct(Long id);
	List<Sale> FindProductByName(String name);
	
	
	

}
