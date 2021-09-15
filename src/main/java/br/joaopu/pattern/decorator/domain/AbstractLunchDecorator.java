package br.joaopu.pattern.decorator.domain;

public abstract class AbstractLunchDecorator extends AbstractLunch {
	
	@Override
	public abstract String getCode();
	
	@Override
	public abstract String getName();
}

