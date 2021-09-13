package br.joaopu.pattern.decorator.domain;

public class ChickenLunchDecorator extends AbstractLunchDecorator {
	private AbstractLunch lunch;
	public ChickenLunchDecorator(AbstractLunch lunch) {
		this.lunch = lunch;
		this.addComponent(new MenuComponent("CHK", "CHICKEN", 10.00));
	}
	
	@Override
	public Double cost() {
		return super.cost() + lunch.cost();
	}
	

}
