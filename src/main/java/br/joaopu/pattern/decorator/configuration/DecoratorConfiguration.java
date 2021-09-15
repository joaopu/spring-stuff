package br.joaopu.pattern.decorator.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.joaopu.pattern.decorator.domain.BasicLunch;
import br.joaopu.pattern.decorator.domain.ChickenLunchDecorator;

@Configuration
public class DecoratorConfiguration {
	
	//@Bean("basicLunch")
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
	public ChickenLunchDecorator getDoubleChickenLunch(@Qualifier("chickenLunch") ChickenLunchDecorator lunch) {
		return new ChickenLunchDecorator(lunch);
	}
	
	/*
	@Bean("doubleChickenLunch")
	public ChickenLunchDecorator getDoubleChickenLunch(@Qualifier("chickenLunchXXX") ChickenLunchDecorator basicLunch) {
		return new ChickenLunchDecorator(basicLunch);
	}
	*/
	

}
