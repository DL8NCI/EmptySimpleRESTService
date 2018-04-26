package de.dl8nci.test.emptysimplerestservice;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;

@ApplicationPath("ApplicationPath")
public class RESTServiceMain extends ResourceConfig {

	public RESTServiceMain() {
		packages("de.dl8nci.test.emptysimplerestservice");
		register(MoxyXmlFeature.class);
	}

}





