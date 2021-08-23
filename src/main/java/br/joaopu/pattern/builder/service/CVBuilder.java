package br.joaopu.pattern.builder.service;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import br.joaopu.pattern.builder.domain.CurriculumVitae;

@Named
@Scope("prototype") // a new object of this class will be instantiated each time the bean is requested through the SpringBoot Framework
public class CVBuilder {
	
	private String name;
	private String address;
	private String email;
	private String[] phones;
	
	private String presentation;
	
	private String [] graduation; // graduation or under graduation
	private String [] specialization; // MBA or some other specialization
	private String [] certification;  // course certification
	private String [] masterDegree;  // master degree
	private String [] pHD;  // phd
	private String [] continuedEducationCourse; // extension course in a specific area
	private String [] language; // language like: English, Portuguese, etc.
	
	public CVBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public CVBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	public CVBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public CVBuilder withName(String[] phones) {
		this.phones = phones;
		return this;
	}

	public CVBuilder withPresentation(String presentation) {
		this.presentation = presentation;
		return this;
	}

	public CVBuilder withGraduation(String[] graduation) {
		this.graduation = graduation;
		return this;
	}

	public CVBuilder withSpecialization(String[] specialization) {
		this.specialization = specialization;
		return this;
	}

	public CVBuilder withCertification(String... certification) {
		this.certification = certification;
		return this;
	}
	
	public CVBuilder withMasterDegree(String[] masterDegree) {
		this.masterDegree = masterDegree;
		return this;
	}
	
	public CVBuilder withPHD(String[] pHD) {
		this.pHD = pHD;
		return this;
	}

	public CVBuilder withContinuedEducationCourse(String[] continuedEducationCourse) {
		this.continuedEducationCourse = continuedEducationCourse;
		return this;
	}
	
	public CVBuilder withLanguage(String[] language) {
		this.language = language;
		return this;
	}
	
	public CurriculumVitae build (){
		CurriculumVitae curriculumVitae = new CurriculumVitae();
		
		curriculumVitae.setAddress(address);
		curriculumVitae.setCertification(certification);
		curriculumVitae.setContinuedEducationCourse(continuedEducationCourse);
		curriculumVitae.setEmail(email);
		curriculumVitae.setGraduation(graduation);
		curriculumVitae.setLanguage(language);
		curriculumVitae.setName(name);
		curriculumVitae.setPhones(phones);
		curriculumVitae.setPresentation(presentation);
		curriculumVitae.setProfessionalExperience(certification);
		curriculumVitae.setSpecialization(specialization);
		curriculumVitae.setMasterDegree(masterDegree);
		curriculumVitae.setpHD(pHD);
		
		return curriculumVitae;
	}
	
	
}
