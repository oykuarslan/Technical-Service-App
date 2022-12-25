package com.project.app.service.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.model.Booking;
import com.project.app.model.Proposal;
import com.project.app.model.ProposalState;
import com.project.app.model.Sale;
import com.project.app.repository.ProposalRepository;
import com.project.app.repository.SaleRepository;
import com.project.app.service.ProposalService;

@Service
public class ProposalServiceImpl implements ProposalService {
	
	private ProposalRepository proposalRepository;

	
	@Autowired
	public ProposalServiceImpl(ProposalRepository proposalRepository) {
		super();
		this.proposalRepository = proposalRepository;
	}

	public Proposal createProposal(Proposal proposal)
	{
		proposal.setState(ProposalState.PENDING);
		proposal = proposalRepository.save(proposal);
		proposalRepository.findById(proposal.getId()).get();
		return proposal;
	}
	
	@Override 
	public List<Proposal> getAll(){
		return proposalRepository.findAll();
	}
	
    @Override
    public void deleteProposal(long id) {
   	
        proposalRepository.findById(id).orElseThrow();
        proposalRepository.deleteById(id);
    	
    }

    public Proposal setStatusApproved(Long id, Proposal proposal)
	{
		Proposal prop = proposalRepository.findById(id).get();
		prop.setState(proposal.getState());
		proposalRepository.save(prop);
		return proposalRepository.findById(id).get();
	}
   


}
