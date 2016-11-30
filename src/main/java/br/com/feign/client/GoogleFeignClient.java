package br.com.feign.client;

import br.com.feign.client.configuration.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "GoogleFeignClient", url = "www.google.com.br", configuration = FeignConfiguration.class)
public interface GoogleFeignClient {

	@RequestMapping(method = GET)
	String request();

}
