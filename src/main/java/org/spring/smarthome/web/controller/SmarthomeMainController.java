package org.spring.smarthome.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class SmarthomeMainController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView printMessage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("message", "fvck you");
		return mav;
	}
	
}
