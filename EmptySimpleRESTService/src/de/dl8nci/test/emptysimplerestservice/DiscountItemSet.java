package de.dl8nci.test.emptysimplerestservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DiscountSet")
public class DiscountItemSet {

	private List<DiscountItem> discountItemSet = new ArrayList<DiscountItem>();

	@XmlElement(name = "discountItem")
	public List<DiscountItem> getDiscountItemSet() {
		return discountItemSet;
	}

	public void makeDiscountSet1() {
		discountItemSet.add(new DiscountItem(10, new BigDecimal("1.00")));
		discountItemSet.add(new DiscountItem(30, new BigDecimal("2.00")));
		discountItemSet.add(new DiscountItem(100, new BigDecimal("3.00")));
	}
	
	public void makeDiscountSet2() {
		discountItemSet.add(new DiscountItem(100, new BigDecimal("1.00")));
		discountItemSet.add(new DiscountItem(1000, new BigDecimal("2.00")));
		discountItemSet.add(new DiscountItem(10000, new BigDecimal("3.00")));
	}
}
