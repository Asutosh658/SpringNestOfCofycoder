package com.nt.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Player_info")
@AllArgsConstructor
@RequiredArgsConstructor
public class Player {
	
	@Column(name="playerID")
	@Id
	@SequenceGenerator(name="player_seq_generator",sequenceName = "player_seq",initialValue =100  ,allocationSize = 1)
	@GeneratedValue(generator ="player_seq_generator",  strategy = GenerationType.SEQUENCE)
	private Integer playerid;
	
	@Nonnull
	@Column(name="playerName" ,length = 40)
	private String playername;
	
	@NonNull
	@Column(name="playerState",length = 40)
	private String playerstate;
	
    @NonNull
	@Column
	private String playerSpcialist;
	
	@NonNull
	@Column
	private Double playersal;

}
