// TestEmployee.java

import java.util.Scanner;
class TestEmployee
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		// �迭 ���� ������ �����Ѵ�.
		Employee[] a;

		// �迭�� �����Ѵ�.
		a = new Employee[2];

		int length = a.length;

		// ����ڷκ��� �����͸� �޾Ƽ� �迭�� �߰��Ͽ� ����.
		for(int i = 0; i<length; i++)	
		{
			System.out.print("�̸��� �Է��ϼ��� [������ȣ" + (i+1) + "] : ");
			String name = scan.next();

			System.out.print("�ּҸ� �Է��ϼ��� [������ȣ" + (i+1) + "] : ");
			String address = scan.next();

			System.out.print("������ �Է��ϼ��� [������ȣ" + (i+1) + "] : ");
			int salary = scan.nextInt();

			System.out.print("��ȭ��ȣ�� �Է��ϼ��� [������ȣ" + (i+1) + "] : ");
			String phoneNumber = scan.next();

			a[i] = new Employee(name, address, salary, phoneNumber);
		}

		//����ڷκ��� �迭�� ������ ����
		System.out.println("�����Ͻðڽ��ϱ�?");
		String answer = scan.next();
		if(answer.equals("y")) {
			System.out.println("�����ϰ� ���� ������ȣ�� �Է��ϼ���:");
			int num = scan.nextInt();

			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = scan.next();
			a[num-1].setName(name);

			System.out.print("�ּҸ� �Է��ϼ��� : ");
			String address = scan.next();
			a[num-1].setAddress(address);

			System.out.print("������ �Է��ϼ��� : ");
			int salary = scan.nextInt();
			a[num-1].setannualSalary(salary);

			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			String phoneNumber = scan.next();
			a[num-1].setphoneNumber(phoneNumber);

		}
		
		// �迭�� ����� ��� �����͸� ����Ѵ�.
		for(int i = 0; i < length; i++)
		{
			System.out.println("������ȣ [" + (i+1) + "]\t" + a[i]);
		}
	}
}