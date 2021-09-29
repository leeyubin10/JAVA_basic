// Gameplay.java
// 철수와 영희의 가위바위보 게임 승자 출력

import java.util.Scanner;

public class GamePlay {
	public static void main(String args[]) {
		//가위, 바위, 보 String을 입력 받기 위해 Scanner 객체를 만든다
		Scanner scan = new Scanner(System.in);
		//변수 선언 -> myChoice는 철수, yourChoice는 영희
		String myChoice, yourChoice;

		System.out.println("<--- 철수 --->");		//철수 가위바위보 입력
		System.out.print("가위바위보를 입력하세요: ");
		myChoice = scan.next();
		
		System.out.println("<--- 영희 --->");		//영희 가위바위보 입력
		System.out.print("가위바위보를 입력하세요: ");
		yourChoice = scan.next();
		
		//철수가 가위를 냈을 경우 영희의 3가지 선택에 따른 승패 결과 출력
		if (myChoice.equals("가위")) {
			if (yourChoice.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if (yourChoice.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if (yourChoice.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		}
		//철수가 바위를 냈을 경우 영희의 3가지 선택에 따른 승패 결과 출력
		else if (myChoice.equals("바위")) {
			if (yourChoice.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if (yourChoice.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if (yourChoice.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}
		//철수가 보를 냈을 경우 영희의 3가지 선택에 따른 승패 결과 출력
		else if (myChoice.equals("보")) {
			if (yourChoice.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if (yourChoice.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if (yourChoice.equals("보")) {
				System.out.println("비겼습니다.");
			}
		}
	}
}