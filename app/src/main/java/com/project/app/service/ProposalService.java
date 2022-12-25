package com.project.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.app.model.Proposal;
import com.project.app.model.ProposalState;

@Service
public interface ProposalService {

		Proposal createProposal(Proposal proposal);
		List<Proposal> getAll();
		void deleteProposal(long id);

		Proposal setStatusApproved(Long id, Proposal proposal);

}
