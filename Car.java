package traing;

public class Car {
	private int gear;private String color;private String registration;
	
	public int getGear()
	{
		return gear;
	}
	public void setGear(int gear)
	{
	this.gear=gear;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
	this.color=color;
	}
	public String getRegistration()
	{
		return registration;
	}
	public void setRegistration(String registration)
	{
	this.registration=registration;
	}
  void Start()
  {
	  System.out.print("Car is Started");
  }
  void Stop()
  {
	  System.out.print("Car is stoped");
  }
  
}
