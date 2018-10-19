package com.example.demo;

import java.time.Duration;

import org.springframework.web.reactive.function.client.WebClient;

public class NettyHangApplication {

	public static void main(String[] args) {
		WebClient.create()
			.get().uri("https://" + "self-signed.badssl.com/")
			.exchange().block(Duration.ofSeconds(10));
	}

}
