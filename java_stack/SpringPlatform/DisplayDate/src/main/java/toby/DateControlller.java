package toby;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class DateControlller {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
		String dateForm = dateFormat.format(date);
		model.addAttribute("date", dateForm);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		String dateForm = dateFormat.format(date);
		model.addAttribute("date", dateForm);
		return "time.jsp";
	}
}
