package com.serialize;

import java.io.Serializable;

class SuperEmployee implements Serializable {
	public String lastName;
	static String companyName="CAP";
	transient String address="Bangalore";
	static transient String companyCEO="Pramod";
}
