// loopTest.java
// for��, while��, do-while�� ������ ����

public class loopTest {
	public static void main(String[] args) {
		forTest();			// for�� ����ϴ� �޼��� ȣ��
		whileTest();		// while�� ����ϴ� �޼��� ȣ��
		dowhileTest();		// do-while�� ����ϴ� �޼��� ȣ��
	}
	
	public static void forTest() {		// for�� ����ϴ� �޼���
		int sum, i;		// ���� ����
		System.out.print("for�� �̿�");
		for(sum=0, i=1; i<=100; i++) {
			if(i%2==0) 
			continue;
			sum+=i;
		}
		System.out.println("\tsum=" + sum);
	}

	public static void whileTest() {	// while�� ����ϴ� �޼���
		int sum = 0; 		// ���� ����
		int i = 1;
		System.out.print("while�� �̿�");
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

	public static void dowhileTest() {	// do-while�� ����ϴ� �޼���
		int sum = 0; 		// ���� ����
		int i = 1;
		System.out.print("do-while�� �̿�");
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