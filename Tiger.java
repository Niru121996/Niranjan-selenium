package traing;

public class Tiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildAnimal w= new WildAnimal();
		w.setLive("wild animal live in forest");
		LandAnimal l= new LandAnimal();
		l.setLive("Land animal live in House");
		l.setName("petu");
		l.setAge(5);
		System.out.println("animal name is :"+l.getName());
		System.out.println("animal age is :"+l.getAge()+"yrs");
		System.out.println(l.getLive());
		System.out.println(w.getLive());

	}

}
