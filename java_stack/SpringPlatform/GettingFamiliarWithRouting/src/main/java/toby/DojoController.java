package toby;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String location) {
		if (location.equals("dojo")) {
			return "the dojo is awesome";
		}
		if  (location.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		if (location.equals("San-jose"))  {
			return "San Jose is the dojo hq";
		}
		else {
			return "incorrect route";
		}


	}
	
			
	

}
