package au.com.vocus.mc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exacttarget.wsdl.partnerapi.APIObject;
import com.exacttarget.wsdl.partnerapi.APIProperty;
import com.exacttarget.wsdl.partnerapi.DataExtensionObject;
import com.exacttarget.wsdl.partnerapi.RetrieveRequest;
import com.exacttarget.wsdl.partnerapi.RetrieveRequestMsg;
import com.exacttarget.wsdl.partnerapi.RetrieveResponseMsg;

import au.com.vocus.mc.client.McClient;
import au.com.vocus.mc.dataextension.NbnLocation;

@Service("NbnAddressService")
public class NbnAddressServiceImpl implements NbnAddressService {

	private McClient mc = new McClient("suzie.wai@vocus.com.au", "password");
	
	@Override
	//public NbnAddressSearchResponse get(String roadNumber, String roadName, String roadType, String locality, String state, String postcode) {
	public List<NbnAddress> get(String roadNumber, String roadName, String roadType, String locality, String state, String postcode) {
		
		return getAddressList(roadNumber, roadName, roadType, locality, state, postcode);
		
		/*
		List<NbnAddress> addrList = getAddressList(roadNumber, roadName, roadType, locality, state, postcode);
		NbnAddressSearchResponse response = new NbnAddressSearchResponse();
		response.setNBNAddress(addrList);
		return response;
		*/
	}

	private List<NbnAddress> getAddressList(String roadNumber,	String roadName, String roadType,
			String locality, String state, String postcode) {
		
		RetrieveRequestMsg parameters = new RetrieveRequestMsg();
		parameters.setRetrieveRequest(new RetrieveRequest());
		parameters.getRetrieveRequest().setObjectType("DataExtensionObject[" + NbnLocation.getObjectID() + "]");
		
		for(String field : NbnLocation.fields) {
			parameters.getRetrieveRequest().getProperties().add(field);
		}
		parameters.getRetrieveRequest().setFilter(NbnLocation.getFilter(roadNumber, roadName, roadType, locality, state, postcode));
		
		RetrieveResponseMsg response = mc.soapClient.retrieve(parameters);
		System.out.println("Number of records retrieved: " + response.getResults().size());
		
		List<NbnAddress> addrList = new ArrayList<NbnAddress>();
		for(APIObject obj : response.getResults()) {
			NbnAddress addr = new NbnAddress();
			for(APIProperty prop : ((DataExtensionObject) obj).getProperties().getProperty()) {
				mapProperties(addr, prop);
			}
			addrList.add(addr);
		}
		return addrList;
	}
	
	private void mapProperties(NbnAddress addr, APIProperty prop) {
		
		switch(prop.getName()) {
		case NbnLocation.FIELD_NAME.LOC_ID:
			addr.setNbnLocId(prop.getValue());
		case NbnLocation.FIELD_NAME.GNAF:
			addr.setGnaf(prop.getValue());
		case NbnLocation.FIELD_NAME.ADDR_STR:
			addr.setFormattedAddress(prop.getValue());
		case NbnLocation.FIELD_NAME.UNIT_NUM:
			addr.setUnitNumber(prop.getValue());
		case NbnLocation.FIELD_NAME.UNIT_TYPE:
			addr.setUnit_type_code(prop.getValue());
		case NbnLocation.FIELD_NAME.LEVEL_NUM:
			addr.setLevel_number(prop.getValue());
		case NbnLocation.FIELD_NAME.LEVEL_TYPE:
			addr.setLevel_type_code(prop.getValue());
		case NbnLocation.FIELD_NAME.SITE_NAME:
			addr.setAddress_site_name(prop.getValue());
		case NbnLocation.FIELD_NAME.ROAD_NUM_1:
			addr.setRoad_number_1(prop.getValue());
		case NbnLocation.FIELD_NAME.ROAD_NUM_2:
			addr.setRoad_number_2(prop.getValue());
		case NbnLocation.FIELD_NAME.LOT_NUM:
			addr.setLot_number(prop.getValue());
		case NbnLocation.FIELD_NAME.ROAD_NAME:
			addr.setRoad_name(prop.getValue());
		case NbnLocation.FIELD_NAME.ROAD_SUFFIX:
			addr.setRoad_suffix_code(prop.getValue());
		case NbnLocation.FIELD_NAME.ROAD_TYPE:
			addr.setRoad_type_code(prop.getValue());
		case NbnLocation.FIELD_NAME.LOCALITY:
			addr.setLocality_name(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_NAME:
			addr.setSecondary_complex_name(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_ROAD_NUM_1:
			addr.setComplex_road_number_1(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_ROAD_NUM_2:
			addr.setComplex_road_number_2(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_ROAD_NAME:
			addr.setComplex_road_name(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_ROAD_TYPE:
			addr.setComplex_road_type_code(prop.getValue());
		case NbnLocation.FIELD_NAME.COMPLEX_ROAD_SUFFIX:
			addr.setRoad_suffix_code(prop.getValue());
		case NbnLocation.FIELD_NAME.POSTCODE:
			addr.setPostcode(prop.getValue());
		case NbnLocation.FIELD_NAME.STATE:
			addr.setState_territory_code(prop.getValue());
		case NbnLocation.FIELD_NAME.LATITUDE:
			addr.setLatitude(prop.getValue());
		case NbnLocation.FIELD_NAME.LONGITUDE:
			addr.setLongitude(prop.getValue());
		case NbnLocation.FIELD_NAME.IS_COMPLEX:
			addr.setIs_complex_premise_yn(prop.getValue());
		}
	}
}
