//MethodExample1.java
class MethodExample1 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-222-33333333", "�迵��", 200000);	//��ü1 ����
		Account obj2 = new Account("555-666-77777777", "������", 1000000);	//��ü2 ����
		obj1.deposit(1000000);	//100���� ����
		obj2.withdraw(200000);	//20���� ����
		printAccount(obj1);		//printAccount�Լ� ȣ��
		printAccount(obj2);		//printAccount�Լ� ȣ��
	}
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ:" + obj.accountNo);
		System.out.println("������ �̸�:" + obj.ownerName);
		System.out.println("�ܾ�:" + obj.balance);
		System.out.println(); // �� �ٲ� ���� ���
	}
}