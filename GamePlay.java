// Gameplay.java
// ö���� ������ ���������� ���� ���� ���

import java.util.Scanner;

public class GamePlay {
	public static void main(String args[]) {
		//����, ����, �� String�� �Է� �ޱ� ���� Scanner ��ü�� �����
		Scanner scan = new Scanner(System.in);
		//���� ���� -> myChoice�� ö��, yourChoice�� ����
		String myChoice, yourChoice;

		System.out.println("<--- ö�� --->");		//ö�� ���������� �Է�
		System.out.print("������������ �Է��ϼ���: ");
		myChoice = scan.next();
		
		System.out.println("<--- ���� --->");		//���� ���������� �Է�
		System.out.print("������������ �Է��ϼ���: ");
		yourChoice = scan.next();
		
		//ö���� ������ ���� ��� ������ 3���� ���ÿ� ���� ���� ��� ���
		if (myChoice.equals("����")) {
			if (yourChoice.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if (yourChoice.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if (yourChoice.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}
		//ö���� ������ ���� ��� ������ 3���� ���ÿ� ���� ���� ��� ���
		else if (myChoice.equals("����")) {
			if (yourChoice.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if (yourChoice.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if (yourChoice.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}
		}
		//ö���� ���� ���� ��� ������ 3���� ���ÿ� ���� ���� ��� ���
		else if (myChoice.equals("��")) {
			if (yourChoice.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if (yourChoice.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if (yourChoice.equals("��")) {
				System.out.println("�����ϴ�.");
			}
		}
	}
}