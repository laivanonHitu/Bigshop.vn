package com.bigshop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigshop.service.ProductService;
import com.bigshop.service.menuService;

@Controller
public class HomeController extends baseController {
	@Autowired
	private menuService menuService;
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView homeView() {
		_mv.addObject("menu", this.menuService.getAllMenu());
		_mv.addObject("products", this.productService.getAllProduct());
		_mv.setViewName("web/home");
		return _mv;
	}
}
