import java.util.Scanner;
class PrintFactorialExcludingItself 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int number = sc.nextInt();
		for(int i = 1; i <= number - 1; i++){
			if(number % i == 0){
				System.out.println(i);
			}
		}
	}
}
