package docker_jenkins_integration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMain {
	@Test
	public void testInputIsEven(){
	assertTrue(Main.checkIfInputIsAnEvenNumber(23)); 
	}
}
