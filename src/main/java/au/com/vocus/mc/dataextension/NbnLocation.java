package au.com.vocus.mc.dataextension;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


import com.exacttarget.wsdl.partnerapi.ComplexFilterPart;
import com.exacttarget.wsdl.partnerapi.FilterPart;
import com.exacttarget.wsdl.partnerapi.LogicalOperators;
import com.exacttarget.wsdl.partnerapi.SimpleFilterPart;
import com.exacttarget.wsdl.partnerapi.SimpleOperators;


public class NbnLocation extends DataExtension {
	public static List<String> fields = new ArrayList<String>();
	
	public static final class FIELD_NAME {
		public static final String LOC_ID = "nbn_location_identifier";
		public static final String GNAF = "gnaf_persistent_identifier";
		public static final String ADDR_STR = "formatted_address_string";
		public static final String UNIT_NUM = "unit_number";
		public static final String UNIT_TYPE = "unit_type_code";
		public static final String LEVEL_NUM = "level_number";
		public static final String LEVEL_TYPE = "level_type_code";
		public static final String SITE_NAME = "address_site_name";
		public static final String ROAD_NUM_1 = "road_number_1";
		public static final String ROAD_NUM_2 = "road_number_2";
		public static final String LOT_NUM = "lot_number";
		public static final String ROAD_NAME = "road_name";
		public static final String ROAD_SUFFIX = "road_suffix_code";
		public static final String ROAD_TYPE = "road_type_code";
		public static final String LOCALITY = "locality_name";
		public static final String COMPLEX_NAME = "secondary_complex_name";
		public static final String COMPLEX_ROAD_NUM_1 = "complex_road_number_1";
		public static final String COMPLEX_ROAD_NUM_2 = "complex_road_number_2";
		public static final String COMPLEX_ROAD_NAME = "complex_road_name";
		public static final String COMPLEX_ROAD_TYPE = "complex_road_type_code";
		public static final String COMPLEX_ROAD_SUFFIX = "complex_road_suffix_code";
		public static final String POSTCODE = "postcode";
		public static final String STATE = "state_territory_code";
		public static final String LATITUDE = "latitude";
		public static final String LONGITUDE = "longitude";
		public static final String IS_COMPLEX = "is_complex_premise_yn";
		protected static final String DELTA_TYPE = "delta_type";
	}
	
	static {
		try {
			for(Field field : FIELD_NAME.class.getDeclaredFields()) {
				if(field.getModifiers() == 25)
					fields.add(field.get(null).toString());
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<String> getFields() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String getObjectID() {
		//return "NBN_Location";
		return "2FB32E12-24CA-435A-BA35-FBC06C69140E";
	}
	
	public static FilterPart getFilter(String roadNumber1, String roadName, String roadTypeCode, String locality, String state, String postcode) {
		
		List<SimpleFilterPart> filters = new ArrayList<SimpleFilterPart>();
		SimpleFilterPart sfp = new SimpleFilterPart();
	    sfp.setProperty(FIELD_NAME.DELTA_TYPE);
	    sfp.setSimpleOperator(SimpleOperators.NOT_EQUALS);
	    sfp.getValue().add("Deleted");
		filters.add(sfp);
		
		if(roadNumber1 != null)
			filters.add(getSimpleFilter(FIELD_NAME.ROAD_NUM_1, roadNumber1));
		if(roadName != null)
			filters.add(getSimpleFilter(FIELD_NAME.ROAD_NAME, roadName));
		if(roadTypeCode != null)
			filters.add(getSimpleFilter(FIELD_NAME.ROAD_TYPE, roadTypeCode));
		if(locality != null)
			filters.add(getSimpleFilter(FIELD_NAME.LOCALITY, locality));
		if(state != null)
			filters.add(getSimpleFilter(FIELD_NAME.STATE, state));
		if(postcode != null)
			filters.add(getSimpleFilter(FIELD_NAME.POSTCODE, postcode));
		
		return getFilter(filters);
	}
	
	private static FilterPart getFilter(List<SimpleFilterPart> filters) {
		if(filters == null || filters.size() < 1)
			return null;
		if(filters.size() == 1)
			return filters.get(0);
		
		ComplexFilterPart cfp = new ComplexFilterPart();
		cfp.setLeftOperand(filters.get(0));
		cfp.setLogicalOperator(LogicalOperators.AND);
		cfp.setRightOperand(getFilter(filters.subList(1, filters.size())));
		return cfp;
	}
	
	public static SimpleFilterPart getSimpleFilter(String name, String value) {
		SimpleFilterPart sfp = new SimpleFilterPart();
	    sfp.setProperty(name);
	    sfp.setSimpleOperator(SimpleOperators.EQUALS);
	    sfp.getValue().add(value);
	    return sfp;
	}
	
	
	public static SimpleFilterPart getLocIdFilter(String locID) {
		return getSimpleFilter("nbn_location_identifier", locID);
	}
	
}
