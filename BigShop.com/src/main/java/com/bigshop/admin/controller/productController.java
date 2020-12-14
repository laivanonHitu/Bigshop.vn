package com.bigshop.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigshop.service.ProductService;
import com.bigshop.web.controller.baseController;

@Controller
public class productController extends baseController {
	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/admin/xoa-san-pham/id/{id}" }, method = RequestMethod.GET)
	public ModelAndView deletePost(@PathVariable("id") int id) {
		this.productService.deleteProduct(id);
		_mv = new ModelAndView("redirect:/admin");
		return _mv;
	}

}
