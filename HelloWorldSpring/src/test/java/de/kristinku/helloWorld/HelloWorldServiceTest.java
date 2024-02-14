package de.kristinku.helloWorld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldServiceTest {
	HelloWorldService cut = new HelloWorldService(); //CUT = class under test, immer als Name benutzten wenn, man als Attribut die Klasse hat, die getestet werden soll
	@Test
	public void shouldReturnHelloWorld() {
		String result = cut.serviceHelloWorld();
		Assertions.assertEquals("Hello World", result);
		}
}
