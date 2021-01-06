package com.DienThoaiGiaRe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.DienThoaiGiaRe.service.CategoryService;
import com.DienThoaiGiaRe.service.ProductService;

@Controller
public class ProductController extends BaseController {
	@Autowired
	private ProductService ProductService;
	@Autowired
	private CategoryService categoryService;
	@RequestMapping(value = { "/chi-tiet-san-pham/{id}"}, method = RequestMethod.GET)
	public ModelAndView ProductView(@PathVariable("id") int id) {
		mv = new ModelAndView("web/product/product_detail");
		mv.addObject("category", this.categoryService.getAllCategory());
		mv.addObject("product", this.ProductService.getProductById(id));
		System.out.println("so san pham lay ra dc :" + this.ProductService.getProductById(id));
		return mv;
	}
	
	@RequestMapping(value = { "/dien-thoai/{id}"}, method = RequestMethod.GET)
	public ModelAndView Product(@PathVariable("id") int id) {
		mv = new ModelAndView("web/product/ProductByCategory");
		mv.addObject("ProductBycategory", this.categoryService.getCategoryById(id));
		System.out.println("so san pham lay ra dc :" + this.categoryService.getCategoryById(id));
		return mv;
	}
}
