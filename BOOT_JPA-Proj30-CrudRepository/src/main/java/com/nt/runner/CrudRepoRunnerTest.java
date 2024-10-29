package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Player;
import com.nt.service.IPlayerManagement;

@Component
public class CrudRepoRunnerTest implements CommandLineRunner {
    
	@Autowired
	private IPlayerManagement playerimpl;
	
	
	@Override
	public void run(String... args) throws Exception {
	   
		Player pl= new Player("Syrus", "Odisha", "Football", 50000.00);
		
		try {
			
		String Str=	playerimpl.registerPlayerInfo(pl);
		System.out.println(Str);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem in Runner Class ");
		}

	}

}
