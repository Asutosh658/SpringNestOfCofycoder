package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Player;
import com.nt.repository.IplayerRepository;

@Service
public class PlayerServiceImpl implements IplayerManagementService {
    @Autowired
	private IplayerRepository ipr;
	
	@Override
	public String registerPlayerInfo(List<Player> list) {
		 
		Iterable<Player> pl=ipr.saveAll(list);
		
		return list.size()+"players are saved";

	}

	@Override
	public Iterable<Player> showAllPlayer() {
		
		return ipr.findAll();
		
	
	}

	@Override
	public Player findPlayerById(int id) {
		
		Optional<Player>pl=ipr.findById(id);
		if(pl.isPresent())
		{
			return pl.get();
		}
		else
		{
			 throw new IllegalArgumentException("invalid id");
		}
		
		
	}

}
