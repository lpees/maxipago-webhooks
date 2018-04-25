package br.com.lab510.manipulator;

import com.thoughtworks.xstream.XStream;

import br.com.lab510.models.Request;

public class XmlFile {
	
	private static XStream xStream = new XStream();
	
	public static Request toObject (String content) {
		
		xmlFormat();
		Request objRequest = (Request) xStream.fromXML(content);
		
		return objRequest;
	}
	
	public static void xmlFormat() {
		
		xStream.alias("Request", Request.class);
		xStream.aliasField("transaction-event", Request.class, "transactionEvent");
		
	}
	
}
