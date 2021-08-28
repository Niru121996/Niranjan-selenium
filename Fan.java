package traing;

public class Fan {
	private String type;private String color;private int price;private int speed;
	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
	this.type=type;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
	this.color=color;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
	this.price=price;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
	this.speed=speed;
	}
  void Start()
  {
	  System.out.println("Fan  is on");
  }
  void Stop()
  {
	  System.out.println("Fan is off");
  }
  
}
