import java.util.*;

public class Main {
	int n;// counter var for loop
	int ch;// choice

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int qt;
		float mr;

		while (n == 1) {
			// MainMenu

			System.out.print("\t\t******GST BILLING SOFTWARE****** ");

			System.out.println("\nSelect a category");
			System.out.println("\t1 for EATABLES");
			System.out.println("\t2 for AUTOMOTIVE");
			System.out.println("\t3 for DAILY ESSENTIALS");
			System.out.println("\t4 for ELECTRONICS");
			System.out.println("\t5 for FASHION");
			System.out.println("\t6 for SPORTS");
			System.out.println("\t7 to Exit");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			// MainMenu ends

			// EatablesMenu 
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
					System.out.println("\t21 for Vegetables");
					System.out.println("\t22 for Nuts");
					System.out.println("\t23 for Coconuts water");
					System.out.println("\t24 for Frozen meat");
					System.out.println("\t25 for Caffinated beverages");
					System.out.print("Enter your choice: ");
					int ch1 = sc.nextInt();

					switch (ch1) {
						case 1:
							// Rice , gst-5%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							FivePercent rc = new FivePercent(qt, mr);
							rc.Invoice();
							break;
						case 2:
							// Pulses , gst-5%//
							break;
						case 3:
							// Eggs , gst-18%//not sure
							break;
						case 4:
							// Wheat , gst-0%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							ZeroPercent wh = new ZeroPercent(qt, mr);
							wh.Invoice();
							break;
						case 5:
							// Oil , gst-5%//
							break;
						case 6:
							// Ghee , gst-12%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							TwelvePercent gh = new TwelvePercent(qt, mr);
							gh.Invoice();
							break;
						case 7:
							// Poha , gst-5%//
							break;
						case 8:
							// Spices , gst-5%//
							break;
						case 9:
							// Salt , gst-0%//
							break;
						case 10:
							// Biscuits , gst-18%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							EighteenPercent bst = new EighteenPercent(qt, mr);
							bst.Invoice();
							break;
						case 11:
							// Namkeen , gst-12%//
							break;
						case 12:
							// Coffee , gst- 5%//
							break;
						case 13:
							// Tea , gst-5%//
							break;
						case 14:
							// dry fruits , gst-12%//
							break;
						case 15:
							// Ketchup , gst- 12%//
							break;
						case 16:
							// Pickles , gst-12%//
							break;
						case 17:
							// Noodles , gst-18%//
							break;
						case 18:
							// Honey , gst-0%//
							break;
						case 19:
							// Curd , gst-0%//
							break;
						case 20:
							// Paneer , gst -0%//
							break;
						case 21:
							// vegetables , gst -0%//
							break;
						case 22:
							// Nuts , gst -0%//
							break;
						case 23:
							// Coconut water , gst -12%//
							break;
						case 24:
							// Frozen Meat , gst- 12%//
							break;
						case 25:
							// Caffinated Beverages , gst-28%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							TwentyEightPercent bvg = new TwentyEightPercent(qt, mr);
							bvg.Invoice();
							break;
					}
					// EatablesMenu ends

				// AutoMotiveMenu 
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
					int ch2 = sc.nextInt();

					switch (ch2) {
						case 1:
							// helmets , gst-18%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							EighteenPercent hmt = new EighteenPercent(qt, mr);
							hmt.Invoice();
							break;
						case 2:
							// Face Shields , gst-12%//
							break;
						case 3:
							// Tyre Inflators , gst-12%//
							break;
						case 4:
							// Pressure washer , gst-12%//
							break;
						case 5:
							// Car Tyres , gst-28%//
							break;
						case 6:
							// Car Tube Tyres , gst 18%//
							break;
						case 7:
							// Seat Covers , gst-28%//
							break;
						case 8:
							// Engine Oil , gst-28%//
							break;
						case 9:
							// Vehicle Cleaning Supplies , gst-18%//
							break;
						case 10:
							// Car And Bike parts , gst-28%//
							break;
						case 11:
							// Vaccum cleaner , gst-28%//
							break;
						default:
							System.out.println("Invalid Choice");
					}
					// AutoMotiveMenu ends

				// DailyEssentialsMenu 
				case 3:
					System.out.println("\nSelect an item");
					System.out.println("\t1 for brush");
					System.out.println("\t2 for Tooth paste");
					System.out.println("\t3 for Sanitary napkins");
					System.out.println("\t4 for Shampoo;");
					System.out.println("\t5 for Bodywash");
					System.out.println("\t6 for Soap");
					System.out.println("\t7 for Hair oil");
					System.out.println("\t8 for Detergent");
					System.out.println("\t9 for Floor Cleaner");
					System.out.println("\t10 for Insect killer");
					System.out.println("\t11 for Liquid Handwash");
					System.out.println("\t12 for Room Fresher");
					System.out.println("\t13 for Aluminium Foil");
					System.out.println("\t14 for Measuring Tapes");
					System.out.println("\t15 for Medicine");
					System.out.println("\t16 for Santizier");
					System.out.println("\t17 for Dish Washing Liquid");
					System.out.println("\t18 for Kitchen Ware(wooden)(crockery");
					System.out.println("\t19 for Kids Toys");
					System.out.println("Enter your choice:");
					int ch3 = sc.nextInt();

					switch (ch3) {
						case 1:
							// brush , gst -18%//
							System.out.print("\nEnter quantity: ");
							qt = sc.nextInt();
							System.out.print("Enter MRP: ");
							mr = sc.nextFloat();
							EighteenPercent brush = new EighteenPercent(qt, mr);
							brush.Invoice();
							break;
						case 2:
							// Tooth paste , gst-18%//
							break;
						case 3:
							// Sanitary Napkins , gst-12%//
							break;
						case 4:
							// Shampoo , gst - 28%//
							break;
						case 5:
							// Body Wash , gst-5%//
							break;
						case 6:
							// Soap , gst- 18%//
							break;
						case 7:
							// Hair oil , gst-18%//
							break;
						case 8:
							// Detergent , gst- 18%//
							break;
						case 9:
							// Floor Cleaner , gst- 18%//
							break;
						case 10:
							// Insect Killer , gst- 18%//
							break;
						case 11:
							// Liquid Handwash , gst-18%//
							break;
						case 12:
							// Room Fresher , gst-28%//
							break;
						case 13:
							// Aluminium Foil , gst-18%//
							break;
						case 14:
							// Measuring Tapes , gst-18%//
							break;
						case 15:
							// Medicine , gst -18%//
							break;
						case 16:
							// Santizier , gst- 18%//
							break;
						case 17:
							// Dish washing Liquid , gst-18%//
							break;
						case 18:
							// Kitchen ware(wooden)(crockery) , gst-12%//
							break;
						case 19:
							// Kids toys , gst-12%//
							break;
						default:
							System.out.println("Invalid Choice");
					}
					// DailyEssentialsMenu ends

				// SportsMenu
				case 6:
					System.out.println("\nSelect an item");
					System.out.println("\t1 for Carrom");
					System.out.println("\t2 for Chess");
					System.out.println("\t3 for playing cards");
					System.out.println("\t4 for Cycles");
					System.out.println("\t5 for Skates");
					System.out.println("\t6 for Footballs");
					System.out.println("\t7 for Cricket Bats");
					System.out.println("\t8for Skipping Ropes");
					System.out.println("\t9 for Cricket Ball");
					System.out.println("\t10 for Swimming Gear");
					System.out.println("Enter you choice:");
					int ch4 = sc.nextInt();

					switch (ch4) {

						case 1:
							// carrom, gst - 28%
							break;

						case 2:
							// chess,gst - 28%
							break;

						case 3:
							// playing cards,gst - 28%
							break;

						case 4:
							// cycles , gst - 12%
							break;

						case 5:
							// Skates, gst - 28%
							break;

						case 6:
							// footballs,gst - 28%
							break;

						case 7:
							// crcket bats,gst - 12%
							break;

						case 8:
							// skipping rope,gst - 12%
							break;

						case 9:
							// cricket ball,gst - 28%
							break;

						case 10:
							// swimming gear,gst - 28%
							break;
					}
					// SportsMenu ends

				// ExitMenu
				case 7:
					n = 0;
					break;
				// ExitMenu ends
			}
		}
	}
}

class GST {
	float Gst, Cgst, Sgst, rate, FinalAmount, mrqt;
	static float cgstAdd, sgstAdd, FinalAdd, GstAdd;
	// Final Amount = rate + Cgst + Sgst

	void Invoice() {
		System.out.println("\tRate: " + rate + "\t\tCGST: " + Cgst + "\t\tSGST: " + Sgst + "\t\tGST: " + Gst
				+ "\t\tMRP: " + FinalAmount);
		System.out.println("\tTotal GST: " + GstAdd + "\tTotal CGST: " + cgstAdd + "\tTotal SGST: " + sgstAdd
				+ "\tAmount to be paid: " + FinalAdd);
	}
}

class ZeroPercent extends GST {
	ZeroPercent(int q, float mrp) {
		this.mrqt = mrp * q;
		this.Gst = (0 * mrqt) / 118;
		this.Cgst = this.Sgst = Gst / 2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate + Gst;
		GstAdd += this.Gst;
		cgstAdd += this.Cgst;
		sgstAdd += this.Sgst;
		FinalAdd += this.FinalAmount;
	}
}

class FivePercent extends GST {
	FivePercent(int q, float mrp) {
		this.mrqt = mrp * q;
		this.Gst = (5 * mrqt) / 118;
		this.Cgst = this.Sgst = Gst / 2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate + Gst;
		GstAdd += this.Gst;
		cgstAdd += this.Cgst;
		sgstAdd += this.Sgst;
		FinalAdd += this.FinalAmount;
	}
}

class TwelvePercent extends GST {
	TwelvePercent(int q, float mrp) {
		this.mrqt = mrp * q;
		this.Gst = (12 * mrqt) / 118;
		this.Cgst = this.Sgst = Gst / 2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate + Gst;
		GstAdd += this.Gst;
		cgstAdd += this.Cgst;
		sgstAdd += this.Sgst;
		FinalAdd += this.FinalAmount;
	}
}

class EighteenPercent extends GST {
	EighteenPercent(int q, float mrp) {
		this.mrqt = mrp * q;
		this.Gst = (18 * mrqt) / 118;
		this.Cgst = this.Sgst = Gst / 2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate + Gst;
		GstAdd += this.Gst;
		cgstAdd += this.Cgst;
		sgstAdd += this.Sgst;
		FinalAdd += this.FinalAmount;
	}
}

class TwentyEightPercent extends GST {
	TwentyEightPercent(int q, float mrp) {
		this.mrqt = mrp * q;
		this.Gst = (28 * mrqt) / 118;
		this.Cgst = this.Sgst = Gst / 2;
		this.rate = mrqt - Gst;
		this.FinalAmount = rate + Gst;
		GstAdd += this.Gst;
		cgstAdd += this.Cgst;
		sgstAdd += this.Sgst;
		FinalAdd += this.FinalAmount;
	}
}
