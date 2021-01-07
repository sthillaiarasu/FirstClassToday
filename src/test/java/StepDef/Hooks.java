package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void test()
	{
		System.out.println("start the testing");
	}
	
	@After
	public void test1()
	{
		System.out.println("stop the testing");
	}

}
