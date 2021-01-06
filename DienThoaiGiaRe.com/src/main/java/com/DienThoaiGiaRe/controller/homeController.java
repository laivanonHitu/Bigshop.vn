package com.DienThoaiGiaRe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DienThoaiGiaRe.service.CategoryService;
import com.DienThoaiGiaRe.service.ProductService;

@Controller
public class homeController extends BaseController {
	@Autowired
	private ProductService ProductService;
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public ModelAndView homeView() {
		mv = new ModelAndView("web/home");
		mv.addObject("products", this.ProductService.getAllProduct());
		mv.addObject("category", this.categoryService.getAllCategory());
		System.out.println("so san pham lay ra dc :" + ProductService.getAllProduct().size());
		return mv;
	}
}
