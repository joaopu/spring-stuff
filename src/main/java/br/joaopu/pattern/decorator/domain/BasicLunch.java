package br.joaopu.pattern.decorator.domain;

import java.util.Arrays;

public class BasicLunch extends AbstractLunch {
	public BasicLunch() {
		setComponents(Arrays.asList(MENU_COMPONENT.values()));
		setCode("BASIC1");
		setName("Basic Lunch");
	}
}
