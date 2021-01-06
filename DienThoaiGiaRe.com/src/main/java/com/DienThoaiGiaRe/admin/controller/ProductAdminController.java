package com.DienThoaiGiaRe.admin.controller;

import java.sql.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.DienThoaiGiaRe.controller.BaseController;
import com.DienThoaiGiaRe.entity.Product;
import com.DienThoaiGiaRe.service.ProductService;
import com.DienThoaiGiaRe.util.FileUploadUtil;

@Controller
public class ProductAdminController extends BaseController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/admin/them-san-pham", "/admin/add-product" }, method = RequestMethod.GET)
	public String AddProductView(Map<String, Object> model) {
		Product product = new Product();
		model.put("product", product);
		return "admin/product/addProduct";
	}

	@RequestMapping(value = { "/admin/save" }, method = RequestMethod.POST, produces = "application/*;charset=UTF-8")
	public String DoAddProduct(Model model, HttpServletRequest request, HttpSession httpSession,
			@ModelAttribute("product") Product product, @RequestParam CommonsMultipartFile fileImageUpload,
			@RequestParam Date modifieddate) throws Exception {

		FileUploadUtil fileUploadUtil = new FileUploadUtil();
		String fileUpload = fileUploadUtil.uploadFile(request, httpSession, fileImageUpload);
		// set value products
		product.setImage(fileUpload);
		product.setModifieddate(modifieddate);
		// save product
		this.productService.save(product);

		return "redirect:/admin";
	}

	@RequestMapping(value = { "/admin/update" }, method = RequestMethod.POST, produces = "application/*;charset=UTF-8")
	public String DoEditProduct(Model model, HttpServletRequest request, HttpSession httpSession,
			@ModelAttribute("productDetail") Product product, @RequestParam CommonsMultipartFile fileImageUpload,
			@RequestParam Date modifieddate) throws Exception {

		FileUploadUtil fileUploadUtil = new FileUploadUtil();
		String fileUpload = fileUploadUtil.uploadFile(request, httpSession, fileImageUpload);
		// set value products
		product.setImage(fileUpload);
		product.setModifieddate(modifieddate);
		// update product
		this.productService.updateProduct(product);
		return "redirect:/admin";
	}

	@RequestMapping(value = { "/xoa-san-pham-id/{id}" }, method = RequestMethod.GET)
	public ModelAndView DoDeleteProduct(@PathVariable("id") int id) {
		this.productService.deleteProduct(id);
		mv = new ModelAndView("redirect:/admin");
		return mv;
	}

	@RequestMapping(value = { "/cap-nhat-san-pham-id/{id}" }, method = RequestMethod.GET)
	public String EditProductView(@PathVariable("id") int id, Map<String, Object> model) {
		Product product = new Product();
		product = this.productService.getProductById(id);
		mv = new ModelAndView();
		model.put("productDetail", product);
		return "admin/product/editProduct";
	}
}
