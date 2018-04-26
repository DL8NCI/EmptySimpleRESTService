package de.dl8nci.test.emptysimplerestservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ProviderPath")
public class RESTServiceProvider {

	@GET
	@Produces("text/plain")
	@Path("HelloWorld")
	public String helloWorld() {
		String result = "Hello World!\r\n";
		return result;
	}
}
