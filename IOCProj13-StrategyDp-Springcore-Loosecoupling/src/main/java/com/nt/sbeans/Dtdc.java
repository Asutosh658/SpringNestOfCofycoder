package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")

public final class Dtdc implements ICourier {

	@Override
	public String delivery(int oid) {
		
		return oid+"delivery through Dtdc";
	}

}
