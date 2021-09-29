interface Movable
{
	public void speedUp(int amount);
	public void speedDown(int amount);
	final int speed = 100;
	public void printSpeed()
	{
		System.out.println("현재 속도는 "+speed +"입니다");
	}
}