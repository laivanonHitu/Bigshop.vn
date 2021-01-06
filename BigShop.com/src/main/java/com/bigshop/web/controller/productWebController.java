package com.bigshop.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigshop.service.ProductService;

@Controller
public class productWebController extends baseController{
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value= {"/chi-tiet-san-pham/{id}"}, method = RequestMethod.GET)
	public ModelAndView productView(@PathVariable("id") int id) {
		_mv = new ModelAndView("product/product_detail");
		_mv.addObject("product", this.productService.getProductById(id));
		return _mv;
	}
}
