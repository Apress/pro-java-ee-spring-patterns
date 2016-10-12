package com.apress.simpleapp.service.startup.test;

import com.apress.simpleapp.service.startup.SpringInitializer;

import junit.framework.TestCase;

public class SpringInitializerTest extends TestCase {

	public void testStartupSpringContext() {
		SpringInitializer initializer = new SpringInitializer();
		initializer.startupSpringContext();
	}

}
