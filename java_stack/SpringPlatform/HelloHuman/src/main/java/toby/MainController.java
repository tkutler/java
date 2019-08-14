package toby;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String root() {
		return "hello human";
	}
	@RequestMapping("/{name}")
	public String showName(@PathVariable("name") String name, Model model) {

			return "hello" +  name;
	}

}
