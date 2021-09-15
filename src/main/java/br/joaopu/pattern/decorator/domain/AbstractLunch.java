package br.joaopu.pattern.decorator.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractLunch implements Costable {
	
	private String code;
	private String name;
	private List<Costable> components;
	//private List<MenuComponent> staticComponents = new ArrayList<>();
	protected void addComponents(Collection<? extends Costable> components) {
		this.components.addAll(components);
	}
	protected void addComponent(Costable component) {
		this.components.add(component);
	}
	
	public AbstractLunch() {
		this.components = new ArrayList<>();
	}
	
	public String getCode() {
		return code;
	}

	protected void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public List<Costable> getComponents() {
		return components;
	}

	public void setComponents(List<Costable> components) {
		this.components = components;
	}

	public Double cost() {
		return this.getComponents().stream().mapToDouble(Costable::cost).sum();	
	}
	

}
