package com.bigshop.admin.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bigshop.entity.Product;
import com.bigshop.service.ProductService;
import com.bigshop.web.controller.baseController;

@Controller
public class addController extends baseController {
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = { "/admin/them-san-pham" }, method = RequestMethod.GET)
	public String addProductView(Model model) {
		model.addAttribute("product", new Product());
		return "admin/product/addProduct";
	}
	
	@RequestMapping(value = { "/admin/save" }, method = RequestMethod.POST)
	public String doAddProduct(@RequestParam("image") MultipartFile file, @RequestParam("name") String name) {
		Product product = new Product();
		product.setName(name);
		product.setImage(uploadFile(file));
		this.productService.save(product);
		return "redirect:/admin";
	}

	private String uploadFile(MultipartFile file) {
		if (null != file && file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "/assets/web/image/product");
				if (!dir.exists()) {
					dir.mkdir();
				}
				String name = String.valueOf(new java.util.Date().getTime() + "jpg");
				File serverFile = new File(dir.getAbsoluteFile() + File.separator + name);
				System.out.println("================== path of image on server " + serverFile.getPath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.flush();
				stream.close();
				return name;
			} catch (Exception e) {
				System.out.println("================== Error upload file " + e.getMessage());
			}
		} else {
			System.out.println("================== File upload not exists ==================");
		}
		return null;
	}
}
