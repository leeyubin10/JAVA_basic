// CircleTest.java
// Circle클래스 테스트용

public class CircleTest
{
	public static void main(String args[])
	{
		Circle c1 = new Circle(5.0);	// 반지름이 5.0인 원 생성
		System.out.println("원의 넓이 : " + c1.getArea());
		System.out.println("원의 둘레 : " + c1.getPerimeter());
	}
}