package com.bigshop.service;

import java.util.HashMap;

import com.bigshop.entity.Cart;


public interface ICartProductService {
	public HashMap<Long, Cart> addCart(int id,  HashMap<Long, Cart> cart);
	public HashMap<Long, Cart> editCart(int id, int quantity, HashMap<Long, Cart> cart);
	public HashMap<Long, Cart> deleteCart(long id, HashMap<Long, Cart> cart);
	public int totalPrice(HashMap<Long, Cart> cart);
	public int totalQuantity(HashMap<Long, Cart> cart);
}
