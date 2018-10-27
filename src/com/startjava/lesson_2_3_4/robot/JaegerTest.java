package com.startjava.lesson_2_3_4.robot;

public class JaegerTest{
	public static void main(String[] args) {
		Jaeger titanRedeemer = new Jaeger("Titan Redeemer", "Mark-6", "Virtual", 90.3f, 4f, 2, 10, 8);

		// titanRedeemer.setModelName("Titan Redeemer");
		// titanRedeemer.setMark("Mark-6");
		// titanRedeemer.setOrigin("Virtual");
		// titanRedeemer.setHeight(90.3f);
		// titanRedeemer.setWeight(4f);
		// titanRedeemer.setSpeed(2);
		// titanRedeemer.setStrength(10);  
		// titanRedeemer.setArmor(8);

		Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", titanRedeemer.getMark(), "Hong Kong", 67f, 2.7f, 6, 7, 4);

		// gipsyAvenger.setModelName("Gipsy Avenger");
		// gipsyAvenger.setMark( titanRedeemer.mark);
		// gipsyAvenger.setOrigin("Hong Kong");
		// gipsyAvenger.setHeight(67f);
		// gipsyAvenger.setWeight(2.7f);
		// gipsyAvenger.setSpeed(6);
		// gipsyAvenger.setStrength(7);
		// gipsyAvenger.setArmor(4);

		showJaegerSpecs(titanRedeemer);
		showJaegerSpecs(gipsyAvenger);

		titanRedeemer.drift();
		titanRedeemer.move();

		gipsyAvenger.drift();
		gipsyAvenger.scanKaiju();
		gipsyAvenger.useVortexCannon();
	}
	

	static void showJaegerSpecs(Jaeger jaegerName) {
		System.out.println("Jaeger name: " + jaegerName.getModelName());
		System.out.println("Jaeger mark: " + jaegerName.getMark());
		System.out.println("Jaeger origin: " + jaegerName.getOrigin());
		System.out.println("Jaeger height: " + jaegerName.getHeight());
		System.out.println("Jaeger weight: " + jaegerName.getWeight());
		System.out.println("Jaeger speed: " + jaegerName.getSpeed());
		System.out.println("Jaeger strength: " + jaegerName.getStrength());
		System.out.println("Jaeger armor: " + jaegerName.getArmor());
		System.out.println("----");
	}
}