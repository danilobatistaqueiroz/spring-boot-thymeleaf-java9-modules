package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContext;

import com.example.demo.DemoApplication;


@SpringBootTest(classes=DemoApplication.class)
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	// private ApplicationContext applicationContext;

	// @Bean
	// public ViewResolver htmlViewResolver() {
	// 		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	// 		resolver.setTemplateEngine(templateEngine(htmlTemplateResolver()));
	// 		resolver.setContentType("text/html");
	// 		resolver.setCharacterEncoding("UTF-8");
	// 		return resolver;
	// }

	// private ITemplateResolver htmlTemplateResolver() {
  //   SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
  //   resolver.setApplicationContext(applicationContext);
  //   resolver.setPrefix("classpath:/templates/");
  //   resolver.setCacheable(false);
	// 	resolver.setSuffix(".html");
  //   resolver.setTemplateMode(TemplateMode.HTML);
  //   return resolver;
	// }

}
