package br.joaopu.pattern.builder.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.ObjectFactory;

@Named
public class CVBuilderService {
	
	@Inject
	private ObjectFactory<CVBuilder> cVBuilderObjectFactory;
	
	public CVBuilder createCVBuilder() {
		return cVBuilderObjectFactory.getObject();
	}

}
