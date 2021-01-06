package com.DienThoaiGiaRe.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DienThoaiGiaRe.controller.BaseController;
import com.DienThoaiGiaRe.service.CategoryService;
import com.DienThoaiGiaRe.service.ProductService;

@Controller
public class homeAdminController extends BaseController {
	@Autowired
	private ProductService ProductService;

	

	@RequestMapping(value = { "/admin", "/quan-tri" }, method = RequestMethod.GET)
	public String homeAdminView(ModelMap model, HttpSession httpSession) {
		
		model.addAttribute("products", this.ProductService.getAllProduct());
		return "admin/home";
	}

}
