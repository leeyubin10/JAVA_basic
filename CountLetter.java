// CountLetter.java
// ����ڰ� �Է��� ���ڿ����� ������ ���ڵ��� ��Ÿ���� Ƚ�� ���

import java.util.Scanner;
class CountLetter {
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			
			// 52���� ������ ������ �� �ִ� �迭 count�� �����ϰ� �����϶�.
			int count[] = new int[52];
			
			System.out.print("���ڿ��� �Է��Ͻÿ� : ");
			String buffer = scan.nextLine();

			// �� ���ڰ� �����ϴ� ȸ���� ����Ѵ�.
			for(int i=0; i< buffer.length(); i++)
			{
				char ch = buffer.charAt(i);
				if(ch >= 'A' && ch <= 'Z')
					count[(ch-'A')+26]++; //���� �빮���̸� �ش� ���� ī��Ʈ
				else if(ch >= 'a' && ch <='z')
					count[ch-'a']++;
				else if(ch == ' ')
					 continue; //���� �����̽��̸� �ݺ��� ����Ѵ�
			}

			// �迭�� ����� Ƚ���� ����ϴ� �ݺ�����
			for(int i = 0; i<26; i++)
			{
				if(count[i] != 0)
					System.out.println((char)(i + 'a') + " : "+ count[i]);
			}
			for(int i = 26; i<52; i++)
			{
				if(count[i] != 0)
					System.out.println((char)(i - 26 + 'A') + " : "+ count[i]);
			}
		}
	}