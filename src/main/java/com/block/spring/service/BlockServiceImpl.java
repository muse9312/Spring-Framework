package com.block.spring.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.block.spring.dao.BlockDao;

@Service
public class BlockServiceImpl implements BlockService{
	
	@Inject
	private BlockDao blockDAoImpl;
	
	@Override
	public void list(Model model) {
		model.addAttribute("list", "즐거운 금요일");
		blockDAoImpl.list();
	}

}
