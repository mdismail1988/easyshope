package com.ideafactory.easyshopee.model;

public class Item {
	
	private String itemId;
	private String itemName;
	private double price;
	private int qty;
	
	
	public Item(String itemId, String itemName, double price, int qty) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
