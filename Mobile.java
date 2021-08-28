package traing;

public class Mobile {
	private int version;private String color;private int imeino;
	
	public int getVersion()
	{
		return version;
	}
	public void setVersion(int version)
	{
	this.version=version;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
	this.color=color;
	}
	public int getIMEINO()
	{
		return imeino;
	}
	public void setIMEINO(int imeino)
	{
	this.imeino=imeino;
	}
  void Start()
  {
	  System.out.println("mobile  is on");
  }
  void Stop()
  {
	  System.out.println("Mobile is off");
  }
  
}
