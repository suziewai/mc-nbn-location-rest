package au.com.vocus.mc.service;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/NBNLocation")
@Produces("application/json")
public interface NbnAddressService {
	@GET
	@Path("/Address")
	public List<NbnAddress> get(@FormParam("roadNumber")String roadNumber
						, @FormParam("roadName")String roadName
						, @FormParam("roadType")String roadType
						, @FormParam("locality")String locality
						, @FormParam("state")String state
						, @FormParam("postcode")String postcode);
	
	/*
	@GET
	@Path("/Address")
	public NbnAddressSearchResponse get(@FormParam("roadNumber")String roadNumber
						, @FormParam("roadName")String roadName
						, @FormParam("roadType")String roadType
						, @FormParam("locality")String locality
						, @FormParam("state")String state
						, @FormParam("postcode")String postcode);
	 */
	
}

