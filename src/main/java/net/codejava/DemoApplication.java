package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		if (args.length > 0) {
			System.out.println("First Argument: " + args[0]);
		}
		
		String configVarValue = System.getenv("VAR1");
		System.out.println("VAR1 = " + configVarValue);
		
		String path = System.getenv("PATH");
		System.out.println("PATH = " + path);
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
