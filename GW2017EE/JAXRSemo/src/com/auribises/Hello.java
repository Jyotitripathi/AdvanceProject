package com.auribises;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer;

// Web Service
@Path("/hello")
public class Hello {
	
	// Web Methods
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		String str = "Plain Hello from Auribises"; // Convert it to JSON
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String str = "<html><body><b>HTML Hello from Auribises</b></body></html>";
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String str = "<?xml version='1.0'?><hello>XML Hello from Auribises</hello>";
		return str;
	}
	
}
