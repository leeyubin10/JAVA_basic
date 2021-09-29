//CalFuelEfficiency.java : 자동차의 연비를 계산한다
import java.util.Scanner;
public class CalFuelEfficiency {
	public static void main(String[] args) {
		double drivedistance;
		double fuels;
		double fuelefficiency;
		Scanner scan = new Scanner(System.in);
		System.out.print("주행거리를 입력하세요: ");
		drivedistance = scan.nextDouble();
		System.out.print("사용한 휘발유 양을 입력하세요: ");
		fuels = scan.nextDouble();
		fuelefficiency = drivedistance / fuels;
		System.out.println("연비: " + fuelefficiency);
	}
}