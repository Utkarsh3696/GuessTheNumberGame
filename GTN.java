import java.util.Scanner;

class GTN 
{
	public static void main(String[] args) 
	{
		int min = 1;
		int max = 100;
		int random = (int)(Math.random() *max) - min;
		int score = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n##########################################");
		System.out.print(" # WELCOME TO GUESS THE NUMBER GAME #\n ");
		System.out.println("##########################################");
		System.out.print("Enter A Number : ");
		int user_input = sc.nextInt(); 
		//System.out.println(random);
		
		while(score>0)
		{
			
			if (user_input == random)
			{
				System.out.println("\n##########################################");
				System.out.print(" \n # You Win...! "+" \t \t Socre: "+score+" #\n");
		        System.out.println("##########################################");
				
				break;
			}
			else
			{
				--score;
				System.out.print("\n try another Number "+"\t \t Socre: "+score);
				if (user_input<random)
				{
			    System.out.println("\n##########################################");
				System.out.print(" Hint: It is  grater than you enter a no.  \n");
				System.out.println("##########################################");

				}
				else
				{
				System.out.println("\n##########################################");
				System.out.print(" Hint: It is less than you enter a no. \n");
				System.out.println("##########################################");
				}
				System.out.println("------------------------------------------");
				System.out.print("\n Enter A Number : ");	
			    user_input = sc.nextInt();
			}

		}
		
	}
}
