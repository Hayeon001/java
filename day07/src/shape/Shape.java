package shape;

public abstract class Shape {
	protected int x;
	protected int y;
	public Shape() {
	}
	public Shape(int x, int y) {  //초기화시켜주는 생성자
		this.x = x;
		this.y = y;
	}
	
	//Abstract Method 추상메소드
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x + " , " + y;
	}
	
	
}
