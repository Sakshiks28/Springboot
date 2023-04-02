package com.anudip.agentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="AgentsDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Agent {
	@Id
 int Aid;
 String Aname;
 String Acommission;
 
}