import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p = scan.nextInt();
		System.out.println("Enter the time interval");
		double t = scan.nextDouble();
		System.out.println("Enter the rate of interest");
		double r = scan.nextDouble();
		System.out.println((p*t*r)/100);

	}
}
