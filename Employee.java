//Employee.java

class Employee
{
	private String name;	// �����̸�
	private String address;	// �ּ�
	private int annualSalary;	// ����
	private String phoneNumber;	// ��ȭ��ȣ

	// �������ʵ��� ���� �Ű������� �޴� ������
	public Employee(String name, String address, int annualSalary, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.annualSalary = annualSalary;
		this.phoneNumber = phoneNumber;
	}
	
	//���� �ʵ忡 ���Ͽ� getter�� setter �޼ҵ带 �ۼ��϶�.
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getanuualSalary()
	{
		return annualSalary;
	}

	public void setannualSalary(int annualSalary)
	{
		this.annualSalary = annualSalary;
	}

	public String getphoneNumber()
	{
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	// toString()�޼ҵ带 �ۼ��Ͽ� ����.
	public String toString()
	{
		return "name : " + name + "\tAddress : " + address + "\tannual_salary : " + annualSalary + "\tphone : " + phoneNumber;
	}
}