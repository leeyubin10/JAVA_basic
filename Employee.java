//Employee.java

class Employee
{
	private String name;	// 직원이름
	private String address;	// 주소
	private int annualSalary;	// 연봉
	private String phoneNumber;	// 전화번호

	// 데이터필드의 값을 매개변수로 받는 생성자
	public Employee(String name, String address, int annualSalary, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.annualSalary = annualSalary;
		this.phoneNumber = phoneNumber;
	}
	
	//각각 필드에 대하여 getter와 setter 메소드를 작성하라.
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

	// toString()메소드를 작성하여 본다.
	public String toString()
	{
		return "name : " + name + "\tAddress : " + address + "\tannual_salary : " + annualSalary + "\tphone : " + phoneNumber;
	}
}