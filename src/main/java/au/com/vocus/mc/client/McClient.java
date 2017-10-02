package au.com.vocus.mc.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.common.gzip.GZIPFeature;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;


import com.exacttarget.wsdl.partnerapi.Soap;

public class McClient {

	public Soap soapClient;
	
	public McClient(String username, String password) {
		GZIPFeature gzip = new GZIPFeature();
        gzip.setThreshold(1);

	    JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	    factory.getFeatures().add(gzip);
	    factory.getInInterceptors().add(new LoggingInInterceptor());
	    factory.getOutInterceptors().add(new LoggingOutInterceptor());
	    factory.setAddress("https://webservice.s7.exacttarget.com/Service.asmx");
	    factory.setServiceClass(Soap.class);
		    
	    WSS4JOutInterceptor wss4jOut = new WSS4JOutInterceptor();
	    wss4jOut.setProperty(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN); 
	    wss4jOut.setProperty(WSHandlerConstants.USER, username); 
	    wss4jOut.setProperty(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
	    wss4jOut.setProperty("password", password);
	    wss4jOut.setProperty(WSHandlerConstants.ADD_USERNAMETOKEN_NONCE, "true");
	    wss4jOut.setProperty(WSHandlerConstants.ADD_USERNAMETOKEN_CREATED, "true");
	    wss4jOut.setProperty(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordCallback.class.getName());
	    factory.getOutInterceptors().add(wss4jOut);
	    
	    //Enable GZip compression
	    Map<String, java.util.List<String>> httpHeaders = new HashMap<String, java.util.List<String>>();
	    httpHeaders.put("Content-Encoding",Collections.singletonList("gzip"));
	    httpHeaders.put("Accept-Encoding",Collections.singletonList("gzip"));
	    //Map<String, Object> reqContext = client.getRequestContext();
	    //reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
	    
	    soapClient = (Soap)factory.create();
	}

}
