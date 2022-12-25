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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.model.Booking;
import com.project.app.model.Proposal;
import com.project.app.model.ProposalState;
import com.project.app.model.Sale;
import com.project.app.service.ProposalService;
import com.project.app.service.SaleService;

@RestController
@RequestMapping("proposal")
public class ProposalController {
	
	private ProposalService proposalService;

	@Autowired
	public ProposalController(ProposalService proposalService) {
		this.proposalService = proposalService; 
	}

	@PostMapping(path = "/save")
	public ResponseEntity<Proposal> createProposal(@RequestBody Proposal proposal)
	{
		return new ResponseEntity<Proposal>(proposalService.createProposal(proposal), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Proposal> getAll()
	{
		return proposalService.getAll();
	}
	
	@DeleteMapping(path = "/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id)
	{
		proposalService.deleteProposal(id);
		return ResponseEntity.ok("Başarı ile silindi");
	}
	
	@PutMapping(path = "editStatus/{id}")
	public Proposal editStatus(@PathVariable(name = "id") Long id, @RequestBody Proposal proposal)
	{
		return proposalService.setStatusApproved(id, proposal);
	}

}
