package com.example.want;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	// httpメソッドがGETでURLが「/」のアクセスがあるとこのメソッドが呼ばれる
	@GetMapping("/")public String home() {
		return "home";
	}
}
