package com.anudip.agentmanagement.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.agentmanagement.entity.Agent;

public interface AgentRepository  extends JpaRepository<Agent, Integer> {

	
	static List<Agent>  findAllRepository()
	{
		return null;
	}

}