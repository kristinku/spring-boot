package de.kristinku.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Diese Klasse ist verantwortlich für eingehende http Anfragen -> Beantwortet die Anfrage oder übergibt es den Service
public class HelloWorldControler {
	private HelloWorldService service;
	HelloWorldControler(HelloWorldService service){
		this.service = service;
	}
	
	@GetMapping("hello") // in den "" steht der Pfadname für Bruno
	public String getHelloWorld() {
		return service.serviceHelloWorld();
	}
}
