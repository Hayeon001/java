package shape;

public class Ractangle extends Shape {

	private double width;
	private double height;
	
	//source
	public Ractangle() {
	}

	public Ractangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Ractangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	////////
	
	
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height)*2;
	}

}
