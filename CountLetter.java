// CountLetter.java
// 사용자가 입력한 문자열에서 각각의 문자들이 나타나는 횟수 계산

import java.util.Scanner;
class CountLetter {
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			
			// 52개의 정수를 저장할 수 있는 배열 count를 선언하고 생성하라.
			int count[] = new int[52];
			
			System.out.print("문자열을 입력하시오 : ");
			String buffer = scan.nextLine();

			// 각 문자가 등장하는 회수를 계산한다.
			for(int i=0; i< buffer.length(); i++)
			{
				char ch = buffer.charAt(i);
				if(ch >= 'A' && ch <= 'Z')
					count[(ch-'A')+26]++; //만약 대문자이면 해당 문자 카운트
				else if(ch >= 'a' && ch <='z')
					count[ch-'a']++;
				else if(ch == ' ')
					 continue; //만약 스페이스이면 반복을 계속한다
			}

			// 배열에 저장된 횟수를 출력하는 반복루프
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