package com.altran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altran.model.Proposition;

public interface PropositionRepository extends JpaRepository<Proposition, Long>{
	
}
