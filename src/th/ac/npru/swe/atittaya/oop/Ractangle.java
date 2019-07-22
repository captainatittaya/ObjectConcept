package th.ac.npru.swe.atittaya.oop;

public class Ractangle extends Shape {
	private int length;
	private int width;
	
	public Ractangle(int lengthValue,int widthValue){
		length = lengthValue;
		width = widthValue;
	}
	
	@Override
	public double getArea() {
		area = length * width;
		return area;
	}

}
