package com.example.want.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.want.entity.Want;
import com.example.want.service.WantService;

@Controller
// クラス内のメソッドは全てlocalhost:8080/wantsから始まるURLにマッピングされる
@RequestMapping("/wants")
public class WantController {
	@Autowired
	private WantService wantService;

	@GetMapping
	// メソッドの引数にModel型の値を設定するとModelのインスタンスが自動的に渡される
	public String index(Model model) {
		List<Want> wants = wantService.findAll();
		model.addAttribute("wants", wants);
		return "wants/index";
	}
}
