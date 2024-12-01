package com.nt.service;

import java.util.List;

import com.nt.entity.Player;

public interface IplayerManagementService {
    
	public String registerPlayerInfo(List<Player> list);
	
	public Iterable<Player> showAllPlayer();
	
	public Player findPlayerById(int id);
}
