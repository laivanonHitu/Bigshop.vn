package com.DienThoaiGiaRe.model;

public class OrderDetailInfo {
	private int id;

	private String productCode;
	private String productName;

	private int quanity;
	private double price;
	private double amount;

	public OrderDetailInfo() {

	}

	// Sử dụng cho Hibernate Query.
	public OrderDetailInfo(int id, String productCode, //
			String productName, int quanity, double price, double amount) {
		this.id = id;
		this.productCode = productCode;
		this.productName = productName;
		this.quanity = quanity;
		this.price = price;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
