package com.DienThoaiGiaRe.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DienThoaiGiaRe.dao.PostDAO;

@Controller
public class PostController {
	@Autowired
	private PostDAO postDAO;
	@RequestMapping(value = "/admin/tat-bai-viet", method = RequestMethod.GET)
	public String postView(ModelMap model) {
		model.addAttribute("post", this.postDAO.getAllPost());
		return "admin/post/post";
	}
}
