package br.joaopu.pattern.decorator.domain;

public enum MENU_COMPONENT implements Costable{
	RICE("C1", "rice", 5.00),
	BEANS("C2", "beans", 4.00),
	MEAT("P1", "meat", 15.00),
	SALAD("V1", "salad", 10.00),
	;
	
	private String code;
	private String name;
	private Double cost;
	
	private MENU_COMPONENT(String code, String name, Double cost) {
		this.code = code;
		this.name = name;
		this.cost = cost;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Double getCost() {
		return cost;
	}

	@Override
	public Double cost() {
		return this.getCost();
	}

}
