package com.test.config;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class CloudGatewayConfig {
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    		.route(r -> r.path("/product/**")
	    				.uri("http://localhost:4457/"))
	    		.route(r -> r.path("/consumer/**")
	    				.uri("http://localhost:7776/"))
	    		.build();
	}
	

}
