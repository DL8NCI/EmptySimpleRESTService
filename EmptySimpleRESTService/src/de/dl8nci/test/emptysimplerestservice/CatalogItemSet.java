package de.dl8nci.test.emptysimplerestservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Catalog")
public class CatalogItemSet {

	private List<CatalogItem> catalogItemSet = new ArrayList<CatalogItem>();
	static protected int nextId = 1000;

	@XmlElement(name = "CatalogItem")
	public List<CatalogItem> getCatalogItemSet() {
		return catalogItemSet;
	}

	public void makeCatalog() {
		DiscountItemSet discountItemSet;
		
		catalogItemSet.add(new CatalogItem(1000, "100", "BC237", new BigDecimal("0.09"), "SC"));
		discountItemSet = new DiscountItemSet();
		discountItemSet.makeDiscountSet1();
		catalogItemSet.add(new CatalogItem(1010, "101", "BF255", new BigDecimal("0.19"), "SC", discountItemSet));
		catalogItemSet.add(new CatalogItem(1020, "102", "SSD 500 GB", new BigDecimal("129.95"), "CO"));
		discountItemSet = new DiscountItemSet();
		discountItemSet.makeDiscountSet2();
		catalogItemSet.add(new CatalogItem(1030, "103", "M3x16 DIN912 Stahl verzinkt", new BigDecimal("0.009"), "ME", discountItemSet));
		catalogItemSet.add(new CatalogItem(1040, "104", "CAT5-Kabel, 2m", new BigDecimal("1.99"), "CO"));
	}
}
