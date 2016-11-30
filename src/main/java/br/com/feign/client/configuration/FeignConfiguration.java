package br.com.feign.client.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

	@Bean
	public GoogleFeignRequestInterceptor googleFeignRequestInterceptor() {
		return new GoogleFeignRequestInterceptor();
	}

	public static class GoogleFeignRequestInterceptor implements RequestInterceptor {

		@Override
		public void apply(final RequestTemplate template) {
			template.query("q", "Spring");
		}
	}

}
