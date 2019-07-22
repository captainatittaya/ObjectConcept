package th.ac.npru.swe.atittaya.test;

import th.ac.npru.swe.atittaya.oop.Ractangle;

public class TestDriver {
	static double area;
	public static void main(String[] args) {
		Ractangle r1 = new Ractangle(4,6);
		area = r1.getArea();
		r1.setColor("Red");
		System.out.print("Area :"+area);
		System.out.print(r1.toString());

	}

}
