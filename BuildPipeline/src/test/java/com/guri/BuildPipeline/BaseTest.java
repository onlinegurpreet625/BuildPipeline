package com.guri.BuildPipeline;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {

	@Parameters({"SuiteParm"})
	@Test(groups = {"grp1"}, priority =1)
	public void test1(String str) {

		System.out.println("Test one");
		System.out.println(str);
	}
	
	@Test(groups = {"grp2"}, priority =1)
	public void test2() {

		System.out.println("Test two update part 2");
		String mvnParam = System.getProperty("browser");
		System.out.println(mvnParam);
	}





}
