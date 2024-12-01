package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Player;
import com.nt.service.IplayerManagementService;

import ch.qos.logback.core.joran.spi.EventPlayer;


@Component
public class H2InMemoryDBTest implements CommandLineRunner {
	
	
	@Autowired
	private IplayerManagementService ipms;

	@Override
	public void run(String... args) throws Exception {
	   
		   System.out.println("_____save object operation_____");
		 try {  
		   Player pl1=new Player();
		   pl1.setPlayername("vinay");
		   pl1.setPlayerstate("Madhypradesh");
		   pl1.setPlayersal(50000.0);
		   
		    Player pl2= new Player();
		    pl2.setPlayername("Asutosh");
			   pl2.setPlayerstate("Odisha");
			   pl2.setPlayersal(60000.0);
			   
			   Player pl3= new Player();
			    pl3.setPlayername("nehal");
				   pl3.setPlayerstate("Bihar");
				   pl3.setPlayersal(40000.0);
				   
				   
				  String msg= ipms.registerPlayerInfo(List.of(pl1,pl2,pl3));
				  
				  System.out.println(msg);
				  
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println("********List object Operation********");
		   ipms.showAllPlayer().forEach(pl->System.out.println(pl));

		   System.out.println("********Find object Operation********");
		   System.out.println("1 id player info is ::"+ipms.findPlayerById(1));
	}

}
