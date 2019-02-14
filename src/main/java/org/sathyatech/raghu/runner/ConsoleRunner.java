package org.sathyatech.raghu.runner;

import org.sathyatech.raghu.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private Product product;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(product);
	}

}
