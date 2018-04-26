package de.dl8nci.test.emptysimplerestservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;

public class DiscountItem {

	public int quantity;
	@XmlElement(name = "theDiscountInPercent")
	public BigDecimal discount;

	DiscountItem(int quantity, BigDecimal discount) {
		this.quantity = quantity;
		this.discount = discount;
	}
}
