class ConditionalOrExample1 {
	public static void main(String args[]) {
		int num1 = 0, num2 = 0;
		if (++num2 > 0 | ++num1 > 0)
			System.out.println("num1�� 0���� ũ�ų� num2�� 0���� Ů�ϴ�.");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}