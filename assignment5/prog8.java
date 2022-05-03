import java.util.Scanner;

class credit{
	double charge;
	credit(double charge){
		this.charge = charge;
	}
	credit(){}	
	
	double payback(){
		double pb = 0.0d;
		if(charge <= 500)
			pb += (0.25/100 * charge);
		else if(charge >500 && charge <=1500)
			pb += ((charge-500)*0.5/100)+(500*0.25/100);
		else if(charge >1500 && charge <=2500)
			pb += ((charge - 1500) * 0.75/100) + (1000 * 0.5/100) + (500 * 0.25/100);
		else
			pb += ((charge - 2500) * 1.0/100) + (1000 * 0.75/100) + (1000 * 0.5/100) + (500 * 0.25/100);
		return pb;
	}
}
class prog8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charge amount of the credit card: Rs ");
		double charge = sc.nextDouble();
		credit card = new credit(charge);
		System.out.print("\nThe payback amount from the card is: Rs "+card.payback());
	}
}