package au.com.vocus.mc.service;

import java.util.List;

import au.com.vocus.mc.service.NbnAddress;

public class NbnAddressSearchResponse {
	private List<NbnAddress> address;

	public List<NbnAddress> getNBNAddress() {
		return address;
	}

	public void setNBNAddress(List<NbnAddress> address) {
		this.address = address;
	}
	
}
