package com.DienThoaiGiaRe.model;

import java.sql.Date;
import java.util.List;

public class OrderInfo {
	private int id;
	private Date orderDate;
	private int orderNum;
	private double amount;

	private String userName;
	private String first_name;
	private String last_name;
	private String customerPhone;

	private List<OrderDetailInfo> details;

	public OrderInfo() {

	}

	// Using for Hibernate Query.
	// Sử dụng cho Hibernate Query.
	public OrderInfo(int id, Date orderDate, int orderNum, double amount, String userName, String first_name,
			String last_name, String customerPhone, List<OrderDetailInfo> details) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.orderNum = orderNum;
		this.amount = amount;
		this.userName = userName;
		this.first_name = first_name;
		this.last_name = last_name;
		this.customerPhone = customerPhone;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public List<OrderDetailInfo> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetailInfo> details) {
		this.details = details;
	}

}
