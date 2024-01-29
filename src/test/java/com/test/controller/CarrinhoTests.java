package com.test.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.DemoApplication;

@ContextConfiguration(classes=DemoApplication.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CarrinhoTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
    System.out.println(this.restTemplate);
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/carrinho", String.class)).contains("Produto");
	}
}