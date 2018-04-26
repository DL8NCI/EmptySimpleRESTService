package de.dl8nci.test.emptysimplerestservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("ProviderPath")
public class RESTServiceProvider {

	@GET
	@Produces("text/plain")
	@Path("HelloWorld")
	public String helloWorld() {
		String result = "Hello World!\r\n";
		return result;
	}

	@GET
	@Produces("application/xml")
	@Path("Catalog")
	public CatalogItemSet getCatalog() {
		CatalogItemSet catalog = new CatalogItemSet();
		catalog.makeCatalog();
		return catalog;
	}

	
	@GET
	@Produces("application/xml")
	@Path("CatalogSearch")
	public CatalogItemSet searchCatalog(@QueryParam("category") String category) {
		CatalogItemSet catalog = new CatalogItemSet();
		catalog.makeCatalog();

		List<CatalogItem> catalogItemList = catalog.getCatalogItemSet();
		CatalogItemSet filteredCatalog = new CatalogItemSet();

		for (CatalogItem it : catalogItemList) {if (it.category.equals(category)) filteredCatalog.getCatalogItemSet().add(it);}
		
		return filteredCatalog;
	}
	
	
	
	@GET
	@Produces("application/xml")
	@Path("CatalogItem/{id}")
	public CatalogItemSet getCatalogItem(@PathParam("id") int id) {
		CatalogItemSet catalog = new CatalogItemSet();
		catalog.makeCatalog();
		List<CatalogItem> catalogItemList = catalog.getCatalogItemSet();

		CatalogItem catalogItem = null;
		for (CatalogItem it : catalogItemList) {if (it.id == id) catalogItem = it;}
		
		catalog = new CatalogItemSet();
		if (catalogItem!=null) catalog.getCatalogItemSet().add(catalogItem);
		return catalog;
	}
}
