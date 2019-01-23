package employeecrud;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController("/hello")
public class Hello {
	@RequestMapping
	public String sayHi() {
		return "Hi";
	}
	
}
