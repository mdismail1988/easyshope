package com.ideafactory.easyshopee.model;

import java.util.Date;
import java.util.List;

public class Orders {
	
	private String customerId;
	private String vendorId;
	private String orderId;
	private String status;
	private Date OrderDateTime;
	private List<Item> items;
	
	
	
	public Orders(String customerId, String vendorId, String orderId, String status, Date orderDateTime,
			List<Item> items) {
		super();
		this.customerId = customerId;
		this.vendorId = vendorId;
		this.orderId = orderId;
		this.status = status;
		OrderDateTime = orderDateTime;
		this.items = items;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDateTime() {
		return OrderDateTime;
	}
	public void setOrderDateTime(Date orderDateTime) {
		OrderDateTime = orderDateTime;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
