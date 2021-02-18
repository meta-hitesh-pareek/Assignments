import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Shopping {

	
		static Set<String> set=new HashSet<>();
		final String oil="oil";
		final String soap="soap";
		final String toothpaste="toothpaste";
		final String sugar="sugar";
		
		 static  int costOil=20;
		  static int costSoap=10;
		  static int costToothpaste=10;
	      static int costSugar=40;
		
		static int stockOil=10;
		static int stockSoap=20;
		static int stockToothpaste=4;
		static int stockSugar=10;
		
	
	class Cart
	{
		Map<String,Integer> cartItems=new HashMap<>();
		
		public void addItem()
		{
			
		}
		public void removeItem()
		{
			
		}
		public void displayItems()
		{
			
		}
		public void generateBill()
		{
			
		}
		
		
	}
	public static void main(String args[])
	{
		set.add("oil");
		set.add("sugar");
		set.add("toothpaste");
		set.add("soap");
		char option;
		Scanner sc=new Scanner(System.in);
		System.out.println("Items present in the cart with price and stocks are\n"
				+ "oil "+costOil+" "+stockOil+"\n"
				+ "soap "+costSoap+" "+stockSoap+"\n"
		        + "sugar "+costSugar+" "+stockSugar+"\n"
		        + "toothpaste "+costToothpaste+" "+stockToothpaste+"\n");
	             
		System.out.println("press 'y' to add item ,press 'q' to exit,press 'g' to generate bill");
		option=sc.next().charAt(0);
		while(option!='q')
		{
			if(option=='y')
			{
				System.out.println("enter product name to add");
				String productName=sc.next();
				if(set.contains(productName))
				{
					System.out.println("how much" +productName+"you want to add");
					
					
					
				}
			}
			
		}
		
		
		
	}
	
}
