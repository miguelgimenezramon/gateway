package microservices.book.gateway.fallback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.book.gateway.domain.MultiplicationFallbackResponse;

@RestController
@RequestMapping("/multiplications-fallback")
public class MultiplicationFallbackController {

	@GetMapping
	public MultiplicationFallbackResponse getFallbackRandomMultiplication() {
		
		System.out.println("Generating a DEFAULT random multiplication from GATEWAY");
		return new MultiplicationFallbackResponse("Sorry, service is down","?");

	}
	
}


