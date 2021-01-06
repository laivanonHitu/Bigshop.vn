package com.bigshop.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigshop.entity.Cart;
import com.bigshop.entity.Product;

@Repository
public class cartDAO {
	@Autowired
	private ProductDAOImpl productDAOimpl = new ProductDAOImpl();

	@SuppressWarnings("unlikely-arg-type")
	public HashMap<Long, Cart> addCart(int id, HashMap<Long, Cart> cart) {
		Product p = new Product();
		p = productDAOimpl.getProductById(id);
		Cart itemsCart = new Cart();
		if (p != null && cart.containsKey(id)) {
			itemsCart = cart.get(id);
			itemsCart.setQuantity(itemsCart.getQuantity() + 1);
			itemsCart.setTotalPrice(itemsCart.getTotalPrice() * itemsCart.getQuantity());
		} else {
			itemsCart.setProduct(p);
			itemsCart.setQuantity(1);
			itemsCart.setTotalPrice(itemsCart.getTotalPrice());
		}
		cart.put((long) id, itemsCart);
		return cart;
	}

	@SuppressWarnings("unlikely-arg-type")
	public HashMap<Long, Cart> editCart(int id, int quantity, HashMap<Long, Cart> cart) {
		Cart itemsCart = new Cart();
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			itemsCart = cart.get(id);
			itemsCart.setQuantity(quantity);
			double totalPrice = quantity * (itemsCart.getProduct().getPrice());
			itemsCart.setTotalPrice(totalPrice);
		}
		cart.put((long) id, itemsCart);
		return cart;
	}

	public HashMap<Long, Cart> deleteCart(long id, HashMap<Long, Cart> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	public int totalQuantity(HashMap<Long, Cart> cart) {
		int totalQuantity = 0;
		for (Map.Entry<Long, Cart> itemsCart : cart.entrySet()) {
			totalQuantity += itemsCart.getValue().getQuantity();
		}
		return totalQuantity;
	}

	public int totalPrice(HashMap<Long, Cart> cart) {
		int totalPrice = 0;
		for (Map.Entry<Long, Cart> itemsCart : cart.entrySet()) {
			totalPrice += itemsCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
