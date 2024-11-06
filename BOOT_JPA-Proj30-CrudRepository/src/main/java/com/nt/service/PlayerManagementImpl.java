package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Player;
import com.nt.repository.IPlayerRepo;
@Service
public class PlayerManagementImpl implements IPlayerManagement {
   @Autowired
	private IPlayerRepo playerRepo;
	
/*	@Override
	public String registerPlayerInfo(Player pl) {
		
		Player pl1=playerRepo.save(pl);
	    return pl1.getPlayerid()==null?"::player details not  registerd::":"player details registerd";
	}*/

	@Override
	public boolean isPlayerAvailable(Integer id) {
		boolean flag=playerRepo.existsById(id);
		return flag;
	}
	

}
