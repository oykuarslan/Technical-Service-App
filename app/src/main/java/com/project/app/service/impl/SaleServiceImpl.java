package com.project.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.model.Booking;
import com.project.app.model.Sale;
import com.project.app.model.DTO.SaleStatusRequestDTO;
import com.project.app.repository.SaleRepository;
import com.project.app.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService{
	
	private SaleRepository saleRepository;
	
	@Autowired
	public SaleServiceImpl(SaleRepository saleRepository) {
		super();
		this.saleRepository = saleRepository;
	}
	
	@Override
	public Sale createSale(Sale sale) {
		return saleRepository.save(sale);
	}
	
	@Override 
	public List<Sale> getAllSales(){
		return saleRepository.findAll();
	}
	
    @Override
    public void deleteSale(long id) {
    
    	
        saleRepository.findById(id).orElseThrow();
        saleRepository.deleteById(id);
    	
    }
    
    @Override
    public List<Sale> getByProduct(Long id)
	{
		return saleRepository.findAllByProductIdAndIsSold(id, false);
	}

    @Override
    public List<Sale> FindProductByName(String name) {
        return saleRepository.FindProductByName(name);
    }
 
    
	
	
	

}
