package br.joaopu.pattern.builder.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

@Named
public class CVBuilderService {
	
	@Inject
	private ObjectFactory<CVBuilder> cVBuilderObjectFactory;
	
	@Inject 
	private CVBuilder cvBuilder; 
	
	@Inject 
	private ApplicationContext applicationContext;
	
	public CVBuilder createCVBuilder() {
		return cVBuilderObjectFactory.getObject();
	}
	
	public CVBuilder createCVBuilder1() {
		return applicationContext.getBean(CVBuilder.class);
	}
	
	public CVBuilder createCVBuilder2() {
		return cvBuilder;
	}
	
	

}
