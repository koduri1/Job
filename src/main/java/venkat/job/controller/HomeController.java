package venkat.job.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.http.MediaType;;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/pages/{pagename}")
	public ModelAndView allPages(@PathVariable String pagename, HttpServletResponse response) throws IOException {
		return new ModelAndView(pagename);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test123(HttpServletResponse response) throws IOException {
		return "test123";
	}
}
