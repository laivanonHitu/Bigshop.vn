package com.bigshop.web.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigshop.entity.Cart;
import com.bigshop.service.CartProductServiceImpl;

@Controller
public class CartController extends baseController {
	@Autowired
	private CartProductServiceImpl cartProductService = new CartProductServiceImpl();

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "them-vao-gio-hang/{id}", method = RequestMethod.GET)
	public String addCart(HttpServletRequest request, HttpSession httpSession, @PathVariable("id") int id) {
		HashMap<Long, Cart> cart = (HashMap<Long, Cart>) httpSession.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, Cart>();
		}
		cart = cartProductService.addCart((int)id, cart);
		httpSession.setAttribute("Cart", cart);
		httpSession.setAttribute("TotalCart", cartProductService.totalQuantity(cart));
		httpSession.setAttribute("TotalPrice", cartProductService.totalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
}
