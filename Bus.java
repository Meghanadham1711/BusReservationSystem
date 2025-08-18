package firstProject;

public class Bus {
	int busNo;
	boolean ac;
	int capacity;
	Bus()
	{
		
	}
	Bus(int busNo,boolean ac,int capacity)
	{
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	public void setAc(boolean val)
	{
		this.ac=val;
	}
	public boolean isAc()//accessor methods
	{
		return ac;
	}
	public void setCapacity(int capacity)//mutators
	{
		this.capacity=capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void display()
	{
		System.out.println("Bus Number: "+busNo+" Ac: "+ac+" Capacity: "+capacity);
	}
	public int getBusNo() {
		return busNo;
	}
	
}
