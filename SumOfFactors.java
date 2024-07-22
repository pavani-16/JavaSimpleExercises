import java.util.Scanner; 
class SumOfFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		System.out.println("Enter the value : ");
		int number = sc.nextInt();
		for(int i = 1; i<=number; i++){
			if(number % i == 0){
				sum = sum + i;
			}
		
		}
		System.out.println(sum);
	}
}
