package com.auribises;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class RestClient {

	public static void main(String[] args) {
	
		// code to consume web service
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/JAXRSemo").build());
		
		String plain = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String html = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xml = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		
		System.out.println(plain);
		System.out.println(html);
		System.out.println(xml);
		
		
		

	}

}
