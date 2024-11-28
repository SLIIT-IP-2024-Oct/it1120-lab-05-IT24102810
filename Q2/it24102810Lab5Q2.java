import java.util.Scanner;

public class it24102810Lab5Q2
{
	public static void main(String [] args)
	{
		Scanner ferdi=new Scanner(System.in);

		int no1,no2,no3;
		
		System.out.println("enter number of new members introduced ;");
		no1=ferdi.nextInt();

		if(no1>=0) {

		switch (no1) {
			case 0:
				System.out.println("no price");
				break;

			case 1:
				System.out.println("pen");
				break;
			case 2:
				System.out.println("umbrella");
				break;
			case 3:
				System.out.println("bag");
				break;
			case 4:
				System.out.println("travelling chair");
				break;

			default:
				System.out.println("headphone");
				break;




		}
	}else
		{
			System.out.println("Input must be a number 0 or gretar");
		}
	
	}
}



