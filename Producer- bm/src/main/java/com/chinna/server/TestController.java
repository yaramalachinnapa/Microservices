package com.chinna.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public Product firstPage() {

		Product prd = new Product();
		prd.setProductId(1001);;
		prd.setProductName("Water");;
		prd.setManufacture("Kirkland");;
		prd.setPrice(3.5f);

		return prd;
	}

}