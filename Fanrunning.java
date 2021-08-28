package traing;

public class Fanrunning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f=new Fan();
		f.setType("seeling");
		System.out.println("Fan type is:"+f.getType());
		f.setColor("Brown");
		System.out.println("fan Color is:"+f.getColor());
		f.setPrice(500);
		System.out.println("price of fan is:"+f.getPrice()+"RS");
		f.setSpeed(30);
		System.out.println("Speed of fan is:"+f.getSpeed()+"RPM");
		f.Start();
		f.Stop();
		

	}

}
