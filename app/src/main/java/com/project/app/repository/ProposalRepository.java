package com.project.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.model.Proposal;
import com.project.app.model.ProposalState;
@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Long> {
	List<Proposal> findAllByState(ProposalState state);
	List<Proposal> findAllBySystemUserId(Long userid);

}
