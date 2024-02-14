package de.kristinku.helloWorld;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	public String serviceHelloWorld() {
		return "Hello World";
	}
}
