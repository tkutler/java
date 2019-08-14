package toby;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class CodingController {
	@RequestMapping("/coding")
	public String coding() { 
		return "Hello coding dojo ";
		
	}
	@RequestMapping("/coding/python")
	public String python() {
		return "python/django was awesome";
	}
	@RequestMapping("/coding/java")
	public String java() {
		return "java/spring is better";
	}
	
	

}
