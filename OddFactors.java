import java.util.Scanner;
class OddFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value : ");
		int number = sc.nextInt();
		for(int i = 1; i<=number; i++){
			if(number % i == 0 && i % 2 == 1)
				System.out.println(i);
		}
		
	}
}
