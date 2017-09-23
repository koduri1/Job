package venkat.job.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.http.MediaType;;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/test", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test123(HttpServletResponse response) throws IOException{
	return "test123";
	}
}
