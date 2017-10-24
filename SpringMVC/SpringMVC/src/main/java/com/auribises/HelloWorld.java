package com.auribises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	//String message = "Search the Candle rather than cursing the darkness!!";
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			@RequestParam(value = "message", required = false, defaultValue = "Message") String message) {
		
		System.out.println("--Controller Executed--");
 
		ModelAndView mv = new ModelAndView("helloworld"); // helloworld is the name of the view
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
