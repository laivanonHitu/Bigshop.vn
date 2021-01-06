package com.bigshop.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigshop.dao.cartDAO;
import com.bigshop.entity.Cart;

@Service
public class CartProductServiceImpl implements ICartProductService {
	@Autowired
	private static cartDAO cartDAO = new cartDAO();

	public HashMap<Long, Cart> addCart(int id, HashMap<Long, Cart> cart) {

		return cartDAO.addCart(id, cart);
	}

	@Override
	public HashMap<Long, Cart> editCart(int id, int quantity, HashMap<Long, Cart> cart) {
		return CartProductServiceImpl.cartDAO.editCart(id, quantity, cart);
	}

	@Override
	public HashMap<Long, Cart> deleteCart(long id, HashMap<Long, Cart> cart) {
		return CartProductServiceImpl.cartDAO.deleteCart(id, cart);
	}

	@Override
	public int totalPrice(HashMap<Long, Cart> cart) {
		return CartProductServiceImpl.cartDAO.totalPrice(cart);
	}

	@Override
	public int totalQuantity(HashMap<Long, Cart> cart) {
		return CartProductServiceImpl.cartDAO.totalQuantity(cart);
	}

}
