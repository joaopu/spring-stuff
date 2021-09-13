package br.joaopu.pattern.decorator.domain;

public class MenuComponent implements Costable {
	
	public MenuComponent() {
	}
	
	public MenuComponent(String code, String name, Double cost) {
		this.code = code;
		this.name = name;
		this.cost = cost;
	}
	
	private String code;
	private String name;
	private Double cost;
	
	@Override
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	@Override
	public Double cost() {
		return getCost();
	}
	
	
	
	

}
