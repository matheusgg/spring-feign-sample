package br.com.feign.web.controller;

import br.com.feign.client.GoogleFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(method = GET)
public class SimpleController {

	private final GoogleFeignClient googleClient;

	public SimpleController(final GoogleFeignClient googleClient) {
		this.googleClient = googleClient;
	}

	@RequestMapping
	public String google() {
		return this.googleClient.request();
	}

}
