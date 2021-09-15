package br.joaopu.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.joaopu.pattern.decorator.service.DecoratorService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		DecoratorService decoratorService = ctx.getBean(DecoratorService.class);
		double d = decoratorService.totalCostChicken();
		
		
		
	}

}
