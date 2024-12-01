package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Player_Info")

public class Player {
    
	
	@Id
	@GeneratedValue
	private Integer playerId;
	
	@Column(length = 30)
	private String playername;
	@Column(length = 30)
	private String playerstate;
	@Column
	private double playersal;
	
	
}
