package br.joaopu.pattern.decorator.domain;

public class FritsLunchDecorator extends AbstractLunchDecorator {
	private AbstractLunch lunch;
	public FritsLunchDecorator(AbstractLunch lunch) {
		this.lunch = lunch;
		this.addComponent(new MenuComponent("FRT", "FRITS", 5.00));
	}
	
	@Override
	public Double cost() {
		return super.cost() + lunch.cost();
	}
	
	@Override
	public String getCode() {
		return "FRT " + this.lunch.getCode();
	}

	@Override
	public String getName() {
		return "FRITS " + this.lunch.getName();
	}
	

}
