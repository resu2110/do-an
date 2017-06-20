package org.spring.smarthome.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/temperature")
public class TemperatureController {
	
	@RequestMapping(value="/midroom",method=RequestMethod.GET)
	public ModelAndView showTemperatureAtMidRoom(){
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}
