import java.util.*;
public class GST 
{
	int n;//counter var for loop
	int ch;//choice
	int q; //quantity
	int rate; //price
	int Cgst; //central gst
	int Sgst; //state gst
	int amt; //final bill amount
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n=1,quan=0;
	double Cgst, Sgst;
	String item="";
	while(n==1) 
	{
		System.out.println("Select a category");
		System.out.println("1 for EATABLES");
		System.out.println("2 for ELECTRONICS");
		System.out.println("3 for TRAVEL");
		System.out.println("4 for ....");
		int ch=sc.nextInt();
		switch (ch) 
		{
			case 1:
				System.out.println("Select an item");
				System.out.println("1 for Rice");
				System.out.println("2 for Pulses");
				System.out.println("3 for Eggs");
				int ch1=sc.nextInt();
				switch (ch1)
				{
				case 1:
					item="RICE";
					break;
				case 2:
					item="PULSES";
					break;
				case 3:
					item="EGGS";
				default:
					System.out.println("Invalid Choice");
				}
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println("Enter 1 to add an item and 2 to ");
		}
	}
	System.out.println("PRINTING INVOICE");
	System.out.println("ITEM"+"\t"+item);
	System.out.println("QUANTITY"+"\t"+quan);
	System.out.println("RATE"+"\t"+"1000");
	
}

}
