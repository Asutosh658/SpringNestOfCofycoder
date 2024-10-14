package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public final class BlueDart implements ICourier {

	@Override
	public String delivery(int oid) {
	
		return oid+" delivery through Bluedart";
	}

}
