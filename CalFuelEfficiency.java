//CalFuelEfficiency.java : �ڵ����� ���� ����Ѵ�
import java.util.Scanner;
public class CalFuelEfficiency {
	public static void main(String[] args) {
		double drivedistance;
		double fuels;
		double fuelefficiency;
		Scanner scan = new Scanner(System.in);
		System.out.print("����Ÿ��� �Է��ϼ���: ");
		drivedistance = scan.nextDouble();
		System.out.print("����� �ֹ��� ���� �Է��ϼ���: ");
		fuels = scan.nextDouble();
		fuelefficiency = drivedistance / fuels;
		System.out.println("����: " + fuelefficiency);
	}
}