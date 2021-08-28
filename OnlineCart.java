package traing;

public class OnlineCart {
	
		private int value;private int item;private int discount;
		
		public int getValue()
		{
			return value;
		}
		public void setValue(int value)
		{
		this.value=value;
		}
		public int getItem()
		{
			return item;
		}
		public void setItem(int item)
		{
		this.item=item;
		}
		public int getDiscount()
		{
			return discount;
		}
		public void setDiscount(int discount)
		{
		this.discount=discount;
		} 
		void Add()
		  {
			  System.out.println("1 item  is added in cart");
		  }
		  void Delete()
		  {
			  System.out.println("1 item is deleted from cart");
		  }
		  
		}


