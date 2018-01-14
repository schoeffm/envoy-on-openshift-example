package de.bender.passthrough.passthrough;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class PassthroughApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassthroughApplication.class, args);
	}

}
