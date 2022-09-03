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
		System.out.println("\t2 for ELECTRONICS");
		System.out.println("\t3 for TRAVEL");
		System.out.println("\t4 to Exit");
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();

		switch (ch) {
			case 1:
				System.out.println("\nSelect an item");
				System.out.println("\t1 for Rice");
				System.out.println("\t2 for Pulses");
				System.out.println("\t3 for Eggs");
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
			case 2:
				break;
			case 3:
				break;
			case 4:
				n = 0;
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println("Enter 1 to add an item and 2 to ");
				}
			}
		}
	}

class GST {
	float Gst, Cgst, Sgst, rate, FinalAmount;
	// Final Amount = rate + Cgst + Sgst
}

class FivePercent extends GST {
	FivePercent(int q, float mrp) {
		this.Gst = (5*q*mrp)/118;
		this.Cgst = this.Sgst = Gst/2;
		this.rate = mrp - Gst;
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
