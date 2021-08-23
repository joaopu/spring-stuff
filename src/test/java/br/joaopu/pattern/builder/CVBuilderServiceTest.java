package br.joaopu.pattern.builder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.joaopu.pattern.builder.service.CVBuilder;
import br.joaopu.pattern.builder.service.CVBuilderService;

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
@SpringBootTest(classes= {CVBuilderService.class, CVBuilder.class})
@EnableAutoConfiguration
class CVBuilderServiceTest {
	
	@Inject
	private CVBuilderService cvBuilderService;
	
	@Test
	void testDifferentCVBuilderCreationUsingContext() {
		assertFalse (cvBuilderService.createCVBuilder() == cvBuilderService.createCVBuilder()); 
	}

	@Test
	void testDifferentCVBuilderCreationUsingObjectFactory() {
		assertFalse (cvBuilderService.createCVBuilder1() == cvBuilderService.createCVBuilder1()); 
	}
	
	@Test
	void testSameCVBuilderCreationUsingOnlyPrototypeInject() {
		assertTrue(cvBuilderService.createCVBuilder2() == cvBuilderService.createCVBuilder2()); 
	}
	

}
