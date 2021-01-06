package com.DienThoaiGiaRe.model;

import java.util.ArrayList;
import java.util.List;

import com.DienThoaiGiaRe.entity.Product;
import com.DienThoaiGiaRe.entity.User;


public class CartInfo {
	private int orderNum;
	private User user;
	private final List<CartItems> cartItems = new ArrayList<CartItems>();

	public CartInfo() {

	}

	public List<CartItems> getcartItems() {
		return this.cartItems;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private CartItems findLineById(int id) {
		for (CartItems cart : this.cartItems) {
			if (cart.getProductInfo().getId() == id) {
				return cart;
			}
		}
		return null;
	}

	public void addProduct(Product productInfo, int quantity) {
		CartItems cart = this.findLineById(productInfo.getId());

		if (cart == null) {
			cart = new CartItems();
			cart.setQuantity(0);
			cart.setProductInfo(productInfo);
			this.cartItems.add(cart);
		}

		int newQuantity = cart.getQuantity() + quantity;
		if (newQuantity <= 0) {
			this.cartItems.remove(cart);
		} else {
			cart.setQuantity(newQuantity);
		}
	}

	public void validate() {

	}

	public void updateProduct(int id, int quantity) {
		CartItems cart = this.findLineById(id);

		if (cart != null) {
			if (quantity <= 0) {
				this.cartItems.remove(cart);
			} else {
				cart.setQuantity(quantity);
			}
		}
	}

	public void removeProduct(Product productInfo) {
		CartItems cart = this.findLineById(productInfo.getId());
		if (cart != null) {
			this.cartItems.remove(cart);
		}
	}

	public boolean isEmpty() {
		return this.cartItems.isEmpty();
	}

	public boolean isValidCustomer() {
		return this.user != null && this.user.isValid();
	}

	public int getQuantityTotal() {
		int quantity = 0;
		for (CartItems line : this.cartItems) {
			quantity += line.getQuantity();
		}
		return quantity;
	}

	public double getAmountTotal() {
		double total = 0;
		for (CartItems line : this.cartItems) {
			total += line.getAmount();
		}
		return total;
	}

	public void updateQuantity(CartInfo cartForm) {
		if (cartForm != null) {
			List<CartItems> lines = cartForm.getcartItems();
			for (CartItems line : lines) {
				this.updateProduct(line.getProductInfo().getId(), line.getQuantity());
			}
		}
	}
}
