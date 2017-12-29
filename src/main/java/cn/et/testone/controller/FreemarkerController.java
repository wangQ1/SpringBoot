package cn.et.testone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//使用freemarker只能使用controller注解
public class FreemarkerController {
	@RequestMapping("/indexFtl")
	public String indexFtl(Model model){
		model.addAttribute("hobbyArr", new String[]{"A","B","C"});
		return "aaa";
	}
}
