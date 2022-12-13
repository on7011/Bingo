package com.example.aa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bingo")
public class BingoController {

	// http://localhost:3006/bingo

	//	@Autowired
	//	RandomData randomData;

	@GetMapping
	public String in() {
		return "bingo/index.html";
	}

	RandomData randomData = new RandomData();

	@PostMapping("/result")
	public String result(Model model) {
		// 画面に渡したいデータをModelオブジェクトに追加 【構文】model.addAttribute("属性名", 渡したいデータ);
		model.addAttribute("result", new BingoData(randomData.data()));
		return "bingo/result.html";
	}

	@PostMapping("/result2")
	public String result2(Model model) {
		model.addAttribute("result2", new BingoListData(randomData.listData()));
		return "bingo/result2.html";
	}

}
