// TestEmployee.java

import java.util.Scanner;
class TestEmployee
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		// 배열 참조 변수를 선언한다.
		Employee[] a;

		// 배열을 생성한다.
		a = new Employee[2];

		int length = a.length;

		// 사용자로부터 데이터를 받아서 배열에 추가하여 본다.
		for(int i = 0; i<length; i++)	
		{
			System.out.print("이름을 입력하세요 [직원번호" + (i+1) + "] : ");
			String name = scan.next();

			System.out.print("주소를 입력하세요 [직원번호" + (i+1) + "] : ");
			String address = scan.next();

			System.out.print("연봉을 입력하세요 [직원번호" + (i+1) + "] : ");
			int salary = scan.nextInt();

			System.out.print("전화번호를 입력하세요 [직원번호" + (i+1) + "] : ");
			String phoneNumber = scan.next();

			a[i] = new Employee(name, address, salary, phoneNumber);
		}

		//사용자로부터 배열의 내용을 수정
		System.out.println("수정하시겠습니까?");
		String answer = scan.next();
		if(answer.equals("y")) {
			System.out.println("수정하고 싶은 직원번호를 입력하세요:");
			int num = scan.nextInt();

			System.out.print("이름을 입력하세요 : ");
			String name = scan.next();
			a[num-1].setName(name);

			System.out.print("주소를 입력하세요 : ");
			String address = scan.next();
			a[num-1].setAddress(address);

			System.out.print("연봉을 입력하세요 : ");
			int salary = scan.nextInt();
			a[num-1].setannualSalary(salary);

			System.out.print("전화번호를 입력하세요 : ");
			String phoneNumber = scan.next();
			a[num-1].setphoneNumber(phoneNumber);

		}
		
		// 배열에 저장된 모든 데이터를 출력한다.
		for(int i = 0; i < length; i++)
		{
			System.out.println("직원번호 [" + (i+1) + "]\t" + a[i]);
		}
	}
}