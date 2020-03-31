package com.barbaro.testmaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AppTest {

	@Test
	public void test() {
		int suma = 2 + 2;
		assertTrue(suma==5);
	}
}
