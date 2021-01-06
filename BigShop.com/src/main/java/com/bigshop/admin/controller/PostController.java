package com.bigshop.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bigshop.entity.Post;
import com.bigshop.service.postService;
import com.bigshop.web.controller.baseController;

@Controller
public class PostController extends baseController {
	@Autowired
	private postService postService;

	@RequestMapping(value = { "/admin/them-bai-viet" }, method = RequestMethod.GET)
	public ModelAndView addProductView() {
		_mv.addObject("post", new Post());
		_mv.setViewName("admin/post/addPost");
		return _mv;
	}

	@RequestMapping(value = { "/admin/luu-bai-viet" }, method = RequestMethod.POST)
	public ModelAndView DoAddPost(@ModelAttribute("post") Post post) {
		this.postService.save(post);
		_mv = new ModelAndView("redirect:/admin/tat-bai-viet");
		return _mv;
	}

	@RequestMapping(value = { "/admin/tat-bai-viet" }, method = RequestMethod.GET)
	public ModelAndView getAllPost() {
		_mv.setViewName("admin/post/post");
		_mv.addObject("post", this.postService.getAllPost());
		return _mv;
	}

	@RequestMapping(value = { "/admin/sua-bai-viet/id/{id}" }, method = RequestMethod.GET)
	public ModelAndView updatePost(@PathVariable("id") int id, @ModelAttribute("post") Post post) {
		_mv.setViewName("admin/post/update_post");
		_mv.addObject("post", new Post());
		_mv.addObject("post", this.postService.getPostById(id));
		return _mv;
	}
	
	
	@RequestMapping(value = { "/admin/xem-bai-viet/id/{id}" }, method = RequestMethod.GET)
	public ModelAndView viewPost(@PathVariable("id") int id) {
		_mv.setViewName("admin/post/viewPost");
		_mv.addObject("post", this.postService.getPostById(id));
		return _mv;
	}

	@RequestMapping(value = { "/admin/hoan-tat-sua-bai-viet" }, method = RequestMethod.POST)
	public ModelAndView doUpdatePost(@ModelAttribute("post") Post post) {
		_mv = new ModelAndView("redirect:/admin/tat-bai-viet");
		this.postService.updatePost(post);
		return _mv;
	}

	@RequestMapping(value = { "/admin/xoa-bai-viet/id/{id}" }, method = RequestMethod.GET)
	public ModelAndView deletePost(@PathVariable("id") int id) {
		_mv = new ModelAndView("redirect:/admin/tat-bai-viet");
		this.postService.deletePost(id);
		return _mv;
	}
}
