package br.joaopu.pattern.builder.domain;

public class CurriculumVitae {

	private String name;
	private String address;
	private String email;
	private String[] phones;
	
	private String presentation;
	
	private String [] graduation; // graduation or undergraduation
	private String [] specialization; // MBA or some other specialization
	private String [] certification;  // course certification
	private String [] continuedEducationCourse; // extension course in a specific area
	
	private String[] masterDegree;
	private String[] pHD;
	
	private String [] language; // language like: engliish, portuguese, etc.
	
	private String[] professionalExperience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getPhones() {
		return phones;
	}

	public void setPhones(String[] phones) {
		this.phones = phones;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String[] getGraduation() {
		return graduation;
	}

	public void setGraduation(String[] graduation) {
		this.graduation = graduation;
	}

	public String[] getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String[] specialization) {
		this.specialization = specialization;
	}

	public String[] getCertification() {
		return certification;
	}

	public void setCertification(String[] certification) {
		this.certification = certification;
	}

	public String[] getContinuedEducationCourse() {
		return continuedEducationCourse;
	}

	public void setContinuedEducationCourse(String[] continuedEducationCourse) {
		this.continuedEducationCourse = continuedEducationCourse;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public String[] getProfessionalExperience() {
		return professionalExperience;
	}

	public void setProfessionalExperience(String[] professionalExperience) {
		this.professionalExperience = professionalExperience;
	}

	public String[] getMasterDegree() {
		return masterDegree;
	}

	public void setMasterDegree(String[] masterDegree) {
		this.masterDegree = masterDegree;
	}

	public String[] getpHD() {
		return pHD;
	}

	public void setpHD(String[] pHD) {
		this.pHD = pHD;
	}
	
}
