package br.joaopu.pattern.decorator.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.joaopu.pattern.decorator.domain.BasicLunch;
import br.joaopu.pattern.decorator.domain.ChickenLunchDecorator;
import br.joaopu.pattern.decorator.domain.FritsLunchDecorator;

@Configuration
public class DecoratorConfiguration {
	
	@Bean
	public BasicLunch getBasicLunch() {
		return new BasicLunch();
	}
	
	@Bean
	@Qualifier("chickenLunch")
	public ChickenLunchDecorator getChickenLunch(BasicLunch basicLunch) {
		return new ChickenLunchDecorator(basicLunch);
	}
	
	@Bean
	@Qualifier("doubleChickenLunch")
	// or @Bean("doubleChickenLunch")
	public ChickenLunchDecorator getDoubleChickenLunch(@Qualifier("chickenLunch") ChickenLunchDecorator lunch) {
		return new ChickenLunchDecorator(lunch);
	}
	
	@Bean
	@Qualifier("fritsLunch")
	public FritsLunchDecorator getFritsLunch(BasicLunch basicLunch) {
		return new FritsLunchDecorator(basicLunch);
	}
	
	/*
	@Bean("doubleChickenLunch")
	public ChickenLunchDecorator getDoubleChickenLunch(@Qualifier("chickenLunchXXX") ChickenLunchDecorator basicLunch) {
		return new ChickenLunchDecorator(basicLunch);
	}
	*/
	

}
