package traing;

public class OnlineCartrunning
{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			OnlineCart o=new OnlineCart();
			o.setValue(1100);
			System.out.println("cart value is:"+o.getValue()+"RS");
			o.setItem(8);
			System.out.println("item of cart is:"+o.getItem());
			o.setDiscount(50);
			System.out.println("Discount on cart is :"+o.getDiscount()+"%");
			o.Add();
			o.Delete();
			
		}
}
