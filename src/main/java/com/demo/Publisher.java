package com.demo;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String endpoint = "http://localhost:8001/demo/hello-world";
		System.out.println("Publising endpoint: " + endpoint);
		Endpoint.publish(endpoint, new HelloWorldImpl());
	}

}
