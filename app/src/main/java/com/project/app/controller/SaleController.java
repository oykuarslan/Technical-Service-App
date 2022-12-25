package com.project.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.app.model.Sale;
import com.project.app.model.DTO.BookingStatusRequestDTO;
import com.project.app.model.DTO.SaleStatusRequestDTO;
import com.project.app.service.SaleService;

@RequestMapping(path = "sale")
@RestController
public class SaleController {
	
	private SaleService saleService;	
	
	@Autowired
	public SaleController(SaleService saleService) {
		this.saleService = saleService; 
	}
	
	@PostMapping("/createSale")
	public ResponseEntity<Sale> createSale(@RequestBody Sale sale){
		return new ResponseEntity<Sale>(saleService.createSale(sale), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllSales")
	public List<Sale> getAllSalesInfo(Sale sale){
		return saleService.getAllSales();
	}

	@DeleteMapping("/deleteBooking/{id}")
	public ResponseEntity<String> deleteSale(@PathVariable("id") long id){
		saleService.deleteSale(id);
		return new ResponseEntity<String>("Sale is deleted successfully!", HttpStatus.OK);
	}
	
	@GetMapping("/getByProduct/{id}")
	public List<Sale> getByProduct(@PathVariable(name = "id") Long id)
	{
		return saleService.getByProduct(id);
	}
	
	@GetMapping("/findProductName")
	public ResponseEntity<List<Sale>> FindProductByName(String name){
		return ResponseEntity.ok(saleService.FindProductByName(name));
	}

	

}
