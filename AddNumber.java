// AddNumber.java
// �Էµ� ������ �� ���ϱ�

class AddNumber {
	public static void main(String args[]) {
		// ������ ���� ������ ���� ����
		int intValue = 0;
		// string���� int������ ��ȯ�Ͽ� ����
		for (String str: args) {
			intValue += Integer.parseInt(str);
		}
		// ���� �հ� ���
		System.out.println("�����" + intValue + "�Դϴ�");
	}
}
