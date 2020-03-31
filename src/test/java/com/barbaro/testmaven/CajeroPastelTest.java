package com.barbaro.testmaven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CajeroPastelTest {
	
	@Test
	public void precioPastelTest() {
		
		// Tipo 1, ["gomitas", "alpiste", "coco_tostado"], 40 = 12088
		assertEquals(CajeroPastel
				.calcular(1, new String[]{"gomitas", "alpiste", "coco_tostado"}, 40), 12088);
	}
	
	@Test
	public void precioPastelTest2() {
		String[] toppings = new String[] {"gomitas", "chispitas", "shimishurri_leon"};
		assertEquals(CajeroPastel.calcular(2, toppings, 60), 24060);
	}
	
	@Test
	public void precioPastelTest3() {
		String[] toppings = new String[] {"shimishurri_arg", "aguacate"};
		assertEquals(CajeroPastel.calcular(3, toppings, 100), 80190);
	}
	
	@Test
	public void precioPastelTest4() {
		String[] toppings = new String[] {"gomitas", "alpiste", "aguacate", "chispitas"};
		assertEquals(CajeroPastel.calcular(1, toppings, 50), 15180);
	}
	
	@Test
	public void precioPastelTest5() {
		String[] toppings = new String[] {"alpiste", "aguacate", "shimishurri_leon"};
		assertEquals(CajeroPastel.calcular(2, toppings, 40), 16180);
	}
	
	@Test
	public void precioPastelTest6() {
		String[] toppings = new String[] {"chispitas", "choco_chispitas"};
		assertEquals(CajeroPastel.calcular(3, toppings, 22), 17645.5);
	}
	
	@Test
	public void precioPastelTest7() {
		String[] toppings = new String[] {"gomitas", "aguacate", "tocino"};
		assertEquals(CajeroPastel.calcular(1, toppings, 4), 1390);
	}
	
	@Test
	public void precioPastelTest8() {
		String[] toppings = new String[] {"shimishurri_leon", "shimishurri_arg"};
		assertEquals(CajeroPastel.calcular(2, toppings, 42), 9500);
	}
	
	@Test
	public void precioPastelTest9() {
		String[] toppings = new String[] {"alpiste", "gomitas", "chispitas", "choco_chispitas", "coco_tostado", "aguacate", "tocino", "shimishurri_leon", "shimishurri_arg"};
		assertEquals(CajeroPastel.calcular(1, toppings, 90), 15000);
	}
	
}
