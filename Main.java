import java.util.*;

public class Main {
	int n;//counter var for loop
	int ch;//choice
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n=1;

	while(n==1) {
		System.out.println("\nSelect a category");
		System.out.println("\t1 for EATABLES");
		System.out.println("\t2 for AUTOMOTIVE");
		System.out.println("\t3 for DAILY ESSENTIALS");
		System.out.println("\t4 for ELECTRONICS");
		System.out.println("\t5 for FASHION AND SKINCARE");
		System.out.println("\t6 to Exit");
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();

		switch (ch) {
			case 1:
				System.out.println("\nSelect an item");
				System.out.println("\t1 for Rice");
				System.out.println("\t2 for Pulses");
				System.out.println("\t3 for Eggs");
				System.out.println("\t4 for wheat");
				System.out.println("\t5 for Oil");
				System.out.println("\t6 for Ghee");
				System.out.println("\t7 for Poha");
				System.out.println("\t8 for Spices");
				System.out.println("\t9 for Salt");
				System.out.println("\t10 for Biscuits");
				System.out.println("\t11 for Namkeen");
				System.out.println("\t12 for Coffee");
				System.out.println("\t13 for Tea");
				System.out.println("\t14 for Dry fruits");
				System.out.println("\t15 for Ketchup");
				System.out.println("\t16 for Pickles");
				System.out.println("\t17 for Noodles");
				System.out.println("\t18 for Honey");
				System.out.println("\t19 for Curd");
				System.out.println("\t20 for Paneer");
				System.out.println("\t21 for Pickles");
				System.out.println("\t22 for Vegetables");
				System.out.println("\t23 for Nuts");
				System.out.println("\t24 for Coconuts water");
				System.out.println("\t25 for Frozen meat");
				System.out.println("\t26 for Caffinated beverages");
				System.out.print("Enter your choice: ");
				int ch1=sc.nextInt();

				switch (ch1) {
					case 1:
						System.out.print("\nEnter quantity: "); 
						int qt = sc.nextInt();
						System.out.print("Enter MRP: ");
						float mr = sc.nextFloat();
						FivePercent f = new FivePercent(qt, mr);
						f.Invoice();
						break;
					case 2:
						break;
					case 3:
						break;
					default:
						System.out.println("Invalid Choice");
				}

		// switch (ch) {
			case 2:
				System.out.println("\nSelect an item");
				System.out.println("\t1 for Helmets");
				System.out.println("\t2 for Face shields");
				System.out.println("\t3 for Tyre inflators");
				System.out.println("\t4 for Pressure washer");
				System.out.println("\t5 for Car tyres");
				System.out.println("\t6 for Car Tube tyres");
				System.out.println("\t7 for Seat covers");
				System.out.println("\t8 for Engine oil");
				System.out.println("\t9 for Vehicle cleaning supplies");
				System.out.println("\t10 for Car and bike parts");
				System.out.println("\t11 for Vaccum cleaner ");
				System.out.println("Enter your choice:");
				int ch2=sc.nextInt();
				break;
				
		// switch (ch) {
		       case 3:
				System.out.println("\nSelect an item");
				System.out.println("\t1 for brush");
				System.out.println("\t2 for Tooth paste");
				System.out.println("\t3 for Sanitary napkins");
				System.out.println("\t4 for Shampoo");
				System.out.println("\t5 for Bodywash");
				System.out.println("\t6 for Soap");
				System.out.println("\t7 for Brush");
				System.out.println("\t8 for Hair oil");
				System.out.println("\t9 for Detergent");
				System.out.println("\t10 for Floor Cleaner");
				System.out.println("\t11 for Insect killer");
				System.out.println("\t12 for Liquid Handwash");
				System.out.println("\t13 for Room Fresher");
				System.out.println("\t14 for Aluminium Foil");
				System.out.println("\t15 for Measuring Tapes");
				System.out.println("\t16 for Medicine");
				System.out.println("\t17 for Santizier");
				System.out.println("\t18 for Dish Washing Liquid");
			    System.out.println("\t19 for Kitchen ware");
				System.out.println("\t20 for Kids Toys");
				int ch3=sc.nextInt();
				break;
				
		// switch (ch) {
			case 4:
			    System.out.println("\nSelect an item");
				System.out.println("\t1 for Washing Machine");
				System.out.println("\t2 for Air Conditioner");
				System.out.println("\t3 for Dish Washing Machine");
				System.out.println("\t4 for Mobile Phone");
				System.out.println("\t5 for Air Podes");
				System.out.println("\t6 for Speakers");
				System.out.println("\t7 for Laptop");
				System.out.println("\t8 for Hair Appliances");
				System.out.println("\t9 for Mixer Grinder");
				System.out.println("\t10 for Water Purifier");
				System.out.println("\t11 for Water Gyser");
				System.out.println("\t12 for Printer");
				System.out.println("\t13 for TV(Above 32 inches)");
				System.out.println("\t14 for Smart Watches");
				System.out.println("\t15 for Sewing Machine");
				int ch4=sc.nextInt();
				
				switch (ch4) {
					case 1:
						//Washing Machine 28%
						break;
					case 2:
					    //AC 28%
						break;
					case 3:
					    //Dish Washing Machine 28%
						break;
					case 4:
						//Mobile phone 12%
						break;
					case 5:
					    //Air podes 18%
						break;
					case 6:
					    //Speaker 18%
						break;
					case 7:
						//laptops 18%
						break;
					case 8:
					    //Hair appliances 28%
						break;
					case 9:
					    //Mixer Grinder 12%
						break;
					case 10:
						//Water Purifier 18%
						break;
					case 11:
					    //Water Geyser 18%
						break;
					case 12:
					    //Printer 18%
						break;
					case 13:
						//TV 28%
						break;
					case 14:
					    //Smart Watches 28%
						break;
					case 15:
					    //Sewing Machine 12%
						break;
					default:
						System.out.println("Invalid Choice");
				}
				break;
		// switch (ch) {
			case 5:
			    System.out.println("\nSelect an item");
				System.out.println("\t1 for Leather Products");
				System.out.println("\t2 for Footwear");
				System.out.println("\t3 for Watches");
				System.out.println("\t4 for Clothing");
				System.out.println("\t5 for Perfumes");
				System.out.println("\t6 for Sunscream");
				System.out.println("\t7 for Cosmetic Products");
				System.out.println("\t8 for Trimmer");
				System.out.println("\t9 for Kids Cotton Clothes");
				int ch5=sc.nextInt();
				
				switch (ch5) {
					case 1:
						//Leather Products 28%
						break;
					case 2:
					    // Footwear 5%
						break;
					case 3:
					    // Watches 28%
						break;
					case 4:
					    // Clothing 12%
					 case 5:
						//Perfumes 28%
						break;
					case 6:
					    // Sunscream 28%
						break;
					case 7:
					    // Cosmetic products 28%
						break;
					case 8:
					    // Trimmer 18%
					 case 9:
					    // Kids Cotton Clothes 5%
					default:
						System.out.println("Invalid Choice");
				}
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println("Enter 1 to add an item and 2 to ");
				}
			}
		}
	}

class GST {
	float Gst, Cgst, Sgst, rate, FinalAmount, mrqt;
	// Final Amount = rate + Cgst + Sgst
}

class FivePercent extends GST {
	FivePercent(int q, float mrp) {
		this.mrqt = mrp*q;
		this.Gst = (18*mrqt)/118;
		this.Cgst = this.Sgst = Gst/2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate+Gst;
	}

	void Invoice() {
		System.out.println("\tRate: "+rate);
		System.out.println("\tCGST: "+Cgst);
		System.out.println("\tSGST: "+Sgst);
		System.out.println("\tGST: "+Gst);
		System.out.println("\tMRP: "+FinalAmount);
	}
}