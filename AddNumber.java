// AddNumber.java
// 입력된 숫자의 합 구하기

class AddNumber {
	public static void main(String args[]) {
		// 숫자의 합을 저장할 변수 선언
		int intValue = 0;
		// string형을 int형으로 변환하여 저장
		for (String str: args) {
			intValue += Integer.parseInt(str);
		}
		// 숫자 합계 출력
		System.out.println("결과는" + intValue + "입니다");
	}
}
