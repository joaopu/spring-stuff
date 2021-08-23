package br.joaopu.pattern.builder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.joaopu.pattern.builder.domain.CurriculumVitae;
import br.joaopu.pattern.builder.service.CVBuilder;
import br.joaopu.pattern.builder.service.CVBuilderService;
import br.joaopu.pattern.builder.service.SomeClient;

/**
 * Ref:
 * https://www.baeldung.com/spring-bean-scopes
 * https://www.baeldung.com/junit-5-runwith
 * https://start.spring.io/
 * 
 * https://medium.com/@pziobron/spring-style-builder-pattern-296868bab815   
 * 
 * @author JoãoCarlosPurificaçã
 *
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= {SomeClient.class, CVBuilderService.class, CVBuilder.class})
@EnableAutoConfiguration
class SomeClientTest {
	
	@Inject
	private SomeClient someClient;
	
	@Inject
	private CVBuilderService cvBuilderService;
	
	@Test
	void testWithNewCVBuilderCreation() {
		
		CurriculumVitae cv = someClient.buildCurriculamVitae();
		CurriculumVitae cvEmpty = someClient.buildCurriculamVitaeEmpty();
		
		assertFalse(cv.getAddress().equals(cvEmpty.getAddress()));
		assertFalse(cv.getCertification().equals(cvEmpty.getCertification()));
		
	}
	

	@Test
	void testWithSameCVBuilder() {
		
		CurriculumVitae cv1 = someClient.buildCurriculamVitae1();
		CurriculumVitae cv1Empty = someClient.buildCurriculamVitae1Empty();
		
		assertTrue(cv1.getAddress().equals(cv1Empty.getAddress()));
		assertTrue(cv1.getCertification().equals(cv1Empty.getCertification()));
		
	}

}
