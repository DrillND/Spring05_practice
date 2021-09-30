package com.yh.finalfinaltp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yh.finalfinaltp.dao.BoardDAO;
import com.yh.finalfinaltp.dto.BoardDTO;



@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value = "/board")
	public String main(Model model) {
		List<BoardDTO> list = dao.selectlist();
		// 최신글이 5개가 아니면 5개로 강제로 만들기
		if (list.size() < 6) {
			while (list.size() != 5) {
				list.add(new BoardDTO());
			}
		}
		model.addAttribute("list", list);
		model.addAttribute("title", "Qna");
		return "board";
	}

}
