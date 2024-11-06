package com.nt.service;

import com.nt.entity.Player;

public interface IPlayerManagement {
	//for inserting player info 
     // public String registerPlayerInfo(Player pl) ;
	
	//for checking player info by id 
      public boolean isPlayerAvailable(Integer id);
	
}
