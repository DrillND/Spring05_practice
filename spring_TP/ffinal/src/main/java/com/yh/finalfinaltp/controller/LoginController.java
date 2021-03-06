package com.yh.finalfinaltp.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yh.finalfinaltp.dao.MemberDAO;
import com.yh.finalfinaltp.dto.MemberDTO;

@Controller
public class LoginController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/loginchk", method = RequestMethod.POST)
	public String loginchk(MemberDTO dto, HttpSession session) {

		dto = dao.chklogin(dto);
		if (dto != null) {
			session.setAttribute("dto", dto);
			return "main";
		}
		else{
			// 로그인에 실패 하였습니다. 아이디,비밀번호를 확인하세요.
			return "redirect:/login?text=loginfail";
		}
		
	}
	
}