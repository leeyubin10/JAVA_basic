// Circle.java

public class Circle
{
	private double radius;	// radius 데이터필드를 전용으로 선언
	private static final double PI = 3.141592;	// final키워드를 이용하여 정적상수 선언

	public Circle(double radius) { 	// 반지름을 매개변수로 받는 생성자
		this.radius = radius;
	}

	public Circle() {	//매개변수가 없는 생성자
		radius = 0.0;
	}

	public void setRadius(double radius) {	// 설정자
		this.radius = radius;
	}

	public double getRadius() {	// 접근자
		return radius;
	}
	
	private double square(double n) {	// 입력값을 제곱하여 반환하는 전용메소드
		return n*n;
	}

	public double getArea() {	// 원의 면적 계산
		return PI * square(radius);
	}
	
	public double getPerimeter() {	// 원의 둘레 계산
		return 2 * radius * PI;
	}

	public static double getPI() {	//정적 메소드
		return PI;
	}

	public static void main(String args[])
	{
		Circle c1 = new Circle();
		c1.square(10.0);
		getPI();
	}
}
