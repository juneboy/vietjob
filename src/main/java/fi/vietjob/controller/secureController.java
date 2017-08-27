package fi.vietjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/secure")

public class secureController {
	@RequestMapping(value="/main", method=RequestMethod.GET)
    public String directControlpage(Model model){
    	    return "controlpanel";
    }
}
