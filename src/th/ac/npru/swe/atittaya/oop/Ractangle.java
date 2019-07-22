package th.ac.npru.swe.atittaya.oop;

public class Ractangle extends Shape {
	int length;
	int width;
	
	Ractangle(int lengthValue,int widthValue){
		length = lengthValue;
		width = widthValue;
	}
	
	@Override
	double getArea() {
		area = length * width;
		return area;
	}

}
