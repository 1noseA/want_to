package com.example.want.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("new")
	public String newWant(Model model) {
		return "wants/new";
	}

	@PostMapping
	public String create(@ModelAttribute Want want) {
		wantService.save(want);
		return "redirect:/wants";
	}

	@GetMapping("{id}/edit")
	// @PathVariableはURL上の値を取得できる
	public String edit(@PathVariable Long id, Model model) {
		Want want = wantService.findById(id);
		model.addAttribute("want", want);
		return "wants/edit";
	}

	@PutMapping("{id}")
	public String update(@PathVariable Long id, @ModelAttribute Want want) {
		want.setId(id);
		wantService.save(want);
		return "redirect:/wants";
	}
}
