package de.dl8nci.test.emptysimplerestservice;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

public class CatalogItem {
	
	public int id;
	public String orderNumber;
	public String description;
	public BigDecimal price;
	public DiscountItemSet discountItemSet;
	public String category;

	CatalogItem(int id, String orderNumber, String description, BigDecimal price, String category) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.description = description;
		this.price = price;
		this.category = category;
		this.discountItemSet = null;
	}

	CatalogItem(int id, String orderNumber, String description, BigDecimal price, String category, DiscountItemSet discountItemSet) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.description = description;
		this.price = price;
		this.category = category;
		this.discountItemSet = discountItemSet;
	}

}
