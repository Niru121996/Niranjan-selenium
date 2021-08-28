package traing;

public class Mobilerunning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.setVersion(11);
		System.out.println("Mobile version is:"+m.getVersion());
		m.setColor("red");
		System.out.println("Mobile Color is:"+m.getColor());
		m.setIMEINO(192918134);
		System.out.println("IMEI NO is:"+m.getIMEINO());
		m.Start();
		m.Stop();
		

	}

}
