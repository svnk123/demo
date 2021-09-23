package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")

public class ExmpleController {

	@GetMapping("/all")
	public void getSearchResult() {
		//String uri = "https://apiprod.eip.tractorsupply.com/getAccessToken?app_id=3f82abb4-734a-4656-8683-13a6ef1b5d2e";
		String uri = "https://qa3-api.tractorsupply.com/getAccessToken?app_id=0658c9c4-4922-44fb-a07f-e39c9b2d134d";
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
		
		System.err.println("Demo err");
	}
}
