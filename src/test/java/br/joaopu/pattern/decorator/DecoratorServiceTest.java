package br.joaopu.pattern.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import br.joaopu.pattern.decorator.configuration.DecoratorConfiguration;
import br.joaopu.pattern.decorator.domain.BasicLunch;
import br.joaopu.pattern.decorator.domain.ChickenLunchDecorator;
import br.joaopu.pattern.decorator.service.DecoratorService;

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

/*
@SpringBootTest(classes= {DecoratorService.class})//,
		                 //BasicLunch.class,
		                 //ChickenLunchDecorator.class,
		                 //DecoratorConfiguration.class})
*/

@ContextConfiguration(classes= {DecoratorConfiguration.class, DecoratorService.class}, loader=AnnotationConfigContextLoader.class)
@EnableAutoConfiguration
class DecoratorServiceTest {
	
	@Inject
	private DecoratorService decoratorService;
	
	@Test
	void testDecoratorService() {
		
		BasicLunch basicLunch =  new BasicLunch();
		assertEquals(basicLunch.cost(), decoratorService.costBasicLunch());
		
		ChickenLunchDecorator chickenLunchDecorator = new ChickenLunchDecorator(basicLunch);
		assertEquals(chickenLunchDecorator.cost(), decoratorService.totalCostChicken());
		
		assertEquals(new ChickenLunchDecorator(chickenLunchDecorator).cost(), decoratorService.totalCostDoubleChicken());
		
	}

}
