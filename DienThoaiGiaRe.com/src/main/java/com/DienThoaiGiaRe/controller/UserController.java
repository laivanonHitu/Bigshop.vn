package com.DienThoaiGiaRe.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DienThoaiGiaRe.entity.User;
import com.DienThoaiGiaRe.service.UserService;

@Controller
public class UserController extends BaseController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/logined" }, method = RequestMethod.GET)
	public String loginSuscess(Model model) {
		model.addAttribute("user", new User());
		return "web/user/logined";

	}

	@RequestMapping(value = { "/dang-nhap" }, method = RequestMethod.GET)
	public String loginView(Model model) {
		model.addAttribute("user", new User());
		return "web/user/login";
	}

	@RequestMapping(value = { "/thuc-hien-dang-nhap" }, method = RequestMethod.POST)
	public ModelAndView DoLogin(@ModelAttribute("user") User user,@RequestParam("uname") String uname, @RequestParam("upwd") String upwd,
			HttpRequest request, HttpServletResponse response) {
		uname = user.getUserName();
		upwd = user.getPassword();
		boolean rs = userService.findUser(uname, upwd);
		if (rs==true) {
			mv = new ModelAndView("redirect:/");
			mv.addObject("firstName", user.getUserName());
		} else {
			mv = new ModelAndView("web/user/login");
			mv.addObject("msg", "sai tên tài khoản hoặc mật khẩu");
		}
//			this.userService.
		return mv;
	}

	@RequestMapping(value = "/dang-ky-tai-khoan", method = RequestMethod.GET)
	public String RegisterView(ModelMap modelmap) {
		return "web/user/register";
	}

}
