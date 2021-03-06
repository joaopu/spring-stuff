package br.joaopu.pattern.decorator.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

import br.joaopu.pattern.decorator.domain.BasicLunch;
import br.joaopu.pattern.decorator.domain.ChickenLunchDecorator;
import br.joaopu.pattern.decorator.domain.FritsLunchDecorator;

@Named
public class DecoratorService {
	
	@Inject
	private BasicLunch basicLunch;
	
	@Inject
	@Qualifier("chickenLunch")
	private ChickenLunchDecorator chickenLunch;
	
	@Inject
	@Qualifier("doubleChickenLunch")
	private ChickenLunchDecorator doubleChickenLunch;
	
	@Inject
	private FritsLunchDecorator fritsLunch;
	
	public Double costBasicLunch() {
		return basicLunch.cost();
	}
	
	public Double totalCostChicken() {
		return chickenLunch.cost();
	}
	
	public Double totalCostDoubleChicken() {
		return doubleChickenLunch.cost();
	}
	
	public Double totalCostFritsLunch() {
		return fritsLunch.cost();
	}
	

}
