//FindNumGame.java
//1부터 100사이의 발생된 임의의 숫자를 5번안에 맞추는 게임

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 입력 받기 위해 Scanner 객체를 만든다
		Scanner scan = new Scanner(System.in);
		// 랜덤 숫자를 읽어오기 위해 Random 객체를 만든다
		Random ranGen = new Random();
		// 변수들을 선언한다
		int ranNum, answer, count=1;
		// 1부터 100까지의 랜덤 숫자 생성
		ranNum=ranGen.nextInt(100)+1;
		// 숫자 맞추기 5번 기회 제공
		while(count<6) {
			// 숫자 정답을 입력 받는다
			System.out.print("숫자를 입력하세요: ");
			answer = scan.nextInt();
			// 입력한 숫자가 랜덤 숫자보다 클 경우
			if(answer > ranNum) {
				System.out.print("더 작습니다.");
				//count ++;
			}
			// 입력한 숫자가 랜덤 숫자보다 작을 경우
			else if(answer < ranNum) {
				System.out.print("더 큽니다.");
				//count ++;
			}
			// 입력한 숫자가 랜덤 숫자와 동일할 경우
			else {
				System.out.println(count + "번만에 정답을 맞추었습니다.");
				break;
			}
			count++;
		}
		// 정답을 5번 안에 맞추지 못했을 경우
		if (count==6) {
			System.out.println("정답을 5번 시도에 맞추지 못했습니다.");
		}
	}
}