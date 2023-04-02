package com.anudip.agentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anudip.agentmanagement.entity.Agent;

@Service
public interface AgentService {
  
	public Agent addAgent(Agent agent);
	public  List<Agent> getAllAgent();
	public void deleteAgent(int id);
	public Agent UpdateAgent(Agent agent);
	
}