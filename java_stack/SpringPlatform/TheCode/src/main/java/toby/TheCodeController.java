package toby;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	@RequestMapping("/")
	public String index () {
		return "index.jsp";
	}
	@RequestMapping (value="/code", method=RequestMethod.POST) 
	public String code(@RequestParam(value="guess") String guess ) {
		if (guess.equals("bushido")) {
			return "redirect:/success";
		}
		else {
			return "redirect:/createError";
		}
		
		
		
	}
	@RequestMapping ("/success")
	public String success() {
		return "success.jsp";
	} 
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test errror!");
        return "redirect:/";
	}

}
