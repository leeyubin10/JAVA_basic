// loopTest.java
// for문, while문, do-while문 실행결과 예제

public class loopTest {
	public static void main(String[] args) {
		forTest();			// for문 사용하는 메서드 호출
		whileTest();		// while문 사용하는 메서드 호출
		dowhileTest();		// do-while문 사용하는 메서드 호출
	}
	
	public static void forTest() {		// for문 사용하는 메서드
		int sum, i;		// 변수 선언
		System.out.print("for문 이용");
		for(sum=0, i=1; i<=100; i++) {
			if(i%2==0) 
			continue;
			sum+=i;
		}
		System.out.println("\tsum=" + sum);
	}

	public static void whileTest() {	// while문 사용하는 메서드
		int sum = 0; 		// 변수 선언
		int i = 1;
		System.out.print("while문 이용");
		while(i < 100) {
			if(i%2==0) {
				i++;
				continue;
			}
			sum+=i;
			i++;
		}
		System.out.println("\tsum=" + sum);
	}

	public static void dowhileTest() {	// do-while문 사용하는 메서드
		int sum = 0; 		// 변수 선언
		int i = 1;
		System.out.print("do-while문 이용");
		do {
			if(i%2==0) {
				i++;
				continue;
			}
			sum+=i;
			i++;
		} while(i < 100);
		System.out.println("\tsum=" + sum);
	}
}