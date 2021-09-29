// Circle.java

public class Circle
{
	private double radius;	// radius �������ʵ带 �������� ����
	private static final double PI = 3.141592;	// finalŰ���带 �̿��Ͽ� ������� ����

	public Circle(double radius) { 	// �������� �Ű������� �޴� ������
		this.radius = radius;
	}

	public Circle() {	//�Ű������� ���� ������
		radius = 0.0;
	}

	public void setRadius(double radius) {	// ������
		this.radius = radius;
	}

	public double getRadius() {	// ������
		return radius;
	}
	
	private double square(double n) {	// �Է°��� �����Ͽ� ��ȯ�ϴ� ����޼ҵ�
		return n*n;
	}

	public double getArea() {	// ���� ���� ���
		return PI * square(radius);
	}
	
	public double getPerimeter() {	// ���� �ѷ� ���
		return 2 * radius * PI;
	}

	public static double getPI() {	//���� �޼ҵ�
		return PI;
	}

	public static void main(String args[])
	{
		Circle c1 = new Circle();
		c1.square(10.0);
		getPI();
	}
}
