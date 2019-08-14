package toby;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		Integer count = (Integer) session.getAttribute("counter");
		count ++ ;
		session.setAttribute("counter", count);
		return "index.jsp";
		
		
		
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("counter");
		model.addAttribute("count", count);
		return "counter.jsp";
	
		
	}
	

}
