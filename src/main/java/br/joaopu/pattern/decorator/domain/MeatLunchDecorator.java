package br.joaopu.pattern.decorator.domain;

public class MeatLunchDecorator extends AbstractLunchDecorator {
	private AbstractLunch lunch;
	public MeatLunchDecorator(AbstractLunch lunch) {
		this.lunch = lunch;
		this.addComponent(new MenuComponent("MEA", "MEAT", 20.00));	
	}
	
	@Override
	public Double cost() {
		return super.cost() + lunch.cost();
	}
	
	@Override
	public String getCode() {
		return "MEA " + this.lunch.getCode();
	}

	@Override
	public String getName() {
		return "MEAT " + this.lunch.getName();
	}

}
