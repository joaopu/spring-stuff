package br.joaopu.pattern.builder.service;

import javax.inject.Inject;
import javax.inject.Named;

import br.joaopu.pattern.builder.domain.CurriculumVitae;

@Named
public class SomeClient {
	
	@Inject
	private CVBuilderService cVBuilderService;
	
	@Inject
	private CVBuilder cVBuilderInjected;
	
	public CurriculumVitae buildCurriculamVitae () {
		CVBuilder cVBuilder = cVBuilderService.createCVBuilder();
		cVBuilder.withAddress("address 1");
		cVBuilder.withCertification("Java 11", " Kubernetes");
		return cVBuilder.build();
	}
	
	public CurriculumVitae buildCurriculamVitaeEmpty () {
		CVBuilder cVBuilder = cVBuilderService.createCVBuilder();
		return cVBuilder.build();
	}
	
	public CurriculumVitae buildCurriculamVitae1 () {
		cVBuilderInjected.withAddress("address 1");
		cVBuilderInjected.withCertification("Java 11", " Kubernetes");
		return cVBuilderInjected.build();
	}
	
	public CurriculumVitae buildCurriculamVitae1Empty () {
		return cVBuilderInjected.build();
	}
	
}
