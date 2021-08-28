package traing;

public class Maruti800 extends Geared {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geared g= new Geared();
		g.setGear(5);
		Car1 c= new Car1();
		c.setColor("White");
		c.setType("Petrol");
		c.setSeater(7);
		System.out.println("car color is :"+c.getColor());
		System.out.println("car type is :"+c.getType());
		System.out.println("car is :"+c.getSeater()+ "Seater");
		System.out.println("car have:" + g.getGear()+"Gear");
		

	}


}
