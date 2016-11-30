package br.com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SpringFeignSampleApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringFeignSampleApplication.class, args);
	}
}
