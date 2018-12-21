package ex.springmvc.springmvcresource.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@RequestMapping(value = "/staticResourceTest")
	public String staticResource(Model model) {
		return "staticResourceTest";
	}
}
