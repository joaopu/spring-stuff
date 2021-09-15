package br.joaopu.pattern.decorator.domain;

public class ChickenLunchDecorator extends AbstractLunchDecorator {
	private AbstractLunch lunch;
	public ChickenLunchDecorator(AbstractLunch lunch) {
		this.lunch = lunch;
		this.addComponent(new MenuComponent("CHK", "CHICKEN", 10.00));
		this.setCode(getCode());
	}
	
	@Override
	public Double cost() {
		return super.cost() + lunch.cost();
	}

	@Override
	public String getCode() {
		return "CHK " + this.lunch.getCode();
	}

	@Override
	public String getName() {
		return "CHICKEN " + this.lunch.getName();
	}
	

}
