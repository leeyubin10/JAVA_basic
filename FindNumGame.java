//FindNumGame.java
//1���� 100������ �߻��� ������ ���ڸ� 5���ȿ� ���ߴ� ����

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڸ� �Է� �ޱ� ���� Scanner ��ü�� �����
		Scanner scan = new Scanner(System.in);
		// ���� ���ڸ� �о���� ���� Random ��ü�� �����
		Random ranGen = new Random();
		// �������� �����Ѵ�
		int ranNum, answer, count=1;
		// 1���� 100������ ���� ���� ����
		ranNum=ranGen.nextInt(100)+1;
		// ���� ���߱� 5�� ��ȸ ����
		while(count<6) {
			// ���� ������ �Է� �޴´�
			System.out.print("���ڸ� �Է��ϼ���: ");
			answer = scan.nextInt();
			// �Է��� ���ڰ� ���� ���ں��� Ŭ ���
			if(answer > ranNum) {
				System.out.print("�� �۽��ϴ�.");
				//count ++;
			}
			// �Է��� ���ڰ� ���� ���ں��� ���� ���
			else if(answer < ranNum) {
				System.out.print("�� Ů�ϴ�.");
				//count ++;
			}
			// �Է��� ���ڰ� ���� ���ڿ� ������ ���
			else {
				System.out.println(count + "������ ������ ���߾����ϴ�.");
				break;
			}
			count++;
		}
		// ������ 5�� �ȿ� ������ ������ ���
		if (count==6) {
			System.out.println("������ 5�� �õ��� ������ ���߽��ϴ�.");
		}
	}
}