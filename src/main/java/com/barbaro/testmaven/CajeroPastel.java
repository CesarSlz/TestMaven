package com.barbaro.testmaven;

public class CajeroPastel {

	private static final float PRECIO_KILO_1 = 300;
	private static final float PRECIO_KILO_2 = 400;
	private static final float PRECIO_KILO_3 = 800;
	
	private static final float PRECIO_ALPISTE = 50;
	private static final float PRECIO_GOMITAS = 10;
	private static final float PRECIO_CHISPITAS = 20;
	private static final float PRECIO_CHOCO_CHISPITAS = 25.5f;
	private static final float PRECIO_COCO_TOSTADO = 28;
	private static final float PRECIO_AGUACATE = 100;
	private static final float PRECIO_TOCINO = 80;
	private static final float PRECIO_SHIMISHURRI_LEON = 30;
	private static final float PRECIO_SHIMISHURRI_ARG = 90;
	
	public static float calcular(int type, String [] toppings, float peso) {
		
		float precio = 0;
		
		switch(type) {
			case 1:
				precio = PRECIO_KILO_1 * peso;
				break;
			case 2:
				precio = PRECIO_KILO_2 * peso;
				break;
			case 3:
				precio = PRECIO_KILO_3 * peso;
				break;
		}
		
		for(String topping: toppings) {
			precio += precioToppings(topping);
		}
		
		return precio;
	}
	
	private static float precioToppings(String topping) {
		switch(topping) {
			case "alpiste":
				return PRECIO_ALPISTE;
			case "gomitas":
				return PRECIO_GOMITAS;
			case "chispitas":
				return PRECIO_CHISPITAS;
			case "choco_chispitas":
				return PRECIO_CHOCO_CHISPITAS;
			case "coco_tostado":
				return PRECIO_COCO_TOSTADO;
			case "aguacate":
				return PRECIO_AGUACATE;
			case "tocino":
				return PRECIO_TOCINO;
			case "shimishurri_leon":
				return PRECIO_SHIMISHURRI_LEON;
			case "shimishurri_arg":
				return PRECIO_SHIMISHURRI_ARG;
			default:
				return 0;
		}
	}
}
