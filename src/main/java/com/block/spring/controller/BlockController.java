package com.block.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.block.spring.service.BlockService;

@Controller
public class BlockController {
	
	@Autowired  // @Autowired 는 스프링이 제공하는 애노테이션임, 타입으로 찾음
	private BlockService blockservice;
	
	
//	@RequestMapping(value="/list.chain", method = RequestMethod.GET)
	@GetMapping(value = "/list.chain")
	public String list(Model model) {
		blockservice.list(model);
		return "list";
	}
	
	
	@RequestMapping("/content.chain")
	public String content(Model model) {
		model.addAttribute("content", "즐거운 금요일");
		return "content";
	}
	

}
